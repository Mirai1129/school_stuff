"""
1. 記得在搶票前至少半小時先開啟
2. 很多判斷試都需要去額外完善，因為每個搶票的頁面不太一樣
3. 這個只適用於大麥網，每個搶票網頁也不同
4. 提前檢查 chrom 的版本和 chromedriver 的版本是否正確，要提前下載 "https://googlechromelabs.github.io/chrome-for-testing/"
    -Manager: "https://pypi.org/project/webdriver-manager/#use-with-chrome"
5. 第一次使用要先準備好登入方法(我為維信掃碼)
"""
import os
import time  # 實現時間延遲等等
import pickle  # 實現紀錄、讀取 cookie 的模塊
from selenium import webdriver
from selenium.webdriver.common.by import By  # 動態擷取: https://ithelp.ithome.com.tw/articles/10300961
from bs4 import BeautifulSoup

# 大麥網首頁
damai_url = "https://www.damai.cn"
# 登陸頁面
login_url = "https://passport.damai.cn/login?ru=https%3A%2F%2Fwww.damai.cn%2F"
# 搶票頁面 -> 我們要搶票的頁面
target_url = "https://detail.damai.cn/item.htm?spm=a2oeg.search_category.0.0.72924d15qAl943&id=765709277149&clicktitle=%E8%B7%A8%E8%B6%8A%E4%BA%8C%E6%AC%A1%E5%85%83ACG%E7%A5%9E%E7%BA%A7%E5%8A%A8%E6%BC%AB%E4%B8%96%E7%95%8C%E5%B7%A1%E5%9B%9E%E6%BC%94%E5%94%B1%E4%BC%9A%E2%80%94%E2%80%94%E5%8C%97%E4%BA%AC%E7%AB%99"

# 瀏覽器初始化設定
options = webdriver.ChromeOptions()
options.add_experimental_option('detach', True)  # 防止瀏覽器自動關閉

# options.add_argument('--start-maximized')  # 瀏覽器最大化

# beautiful module init
soup = BeautifulSoup("html", "html.parser")


class Concerts:
    # 初始化加載
    def __init__(self):
        self.status = 0  # 狀態，表示當前操作執行到了哪個步驟
        self.login_method = 1  # {0: 模擬登陸, 1: cookie 登陸}
        self.driver = webdriver.Chrome(options=options)  # 初始化瀏覽器
        self.want_ticket_num = 4  # TODO: 設定預選的票種數量
        self.ticket_sort = 1  # TODO: 設定排序 -> 0: 第一個開始選擇，1: 預選的最大數量開始選擇

    """
    登入頁面:
    1. 第一次使用要先打開登入驗證方式 (微信)
    2. 未在時間內登入要自行刪除 cookies
    """

    # cookies: 登入網站時候出現的，紀錄用戶訊息
    def set_cookies(self):
        self.driver.get(login_url)  # 跳轉到登錄頁面
        print("###請掃碼登入###")  # 提示訊息
        time.sleep(40)  # 設置延遲等待用戶掃碼(秒)
        print("###登入成功###")  # 提示訊息
        pickle.dump(self.driver.get_cookies(), open("cookies.pkl", "wb"))  # 將 cookies 保存下來
        print("###cookie 保存成功###")  # 提示訊息
        self.driver.get(target_url)  # 跳轉至搶票介面

    # 如果我當前已經有 cookie.pkl
    def get_cookie(self):
        cookies = pickle.load(open("cookies.pkl", "rb"))
        for cookie in cookies:
            cookie_dict = {
                "domain": ".damai.cn",
                "name": cookie.get("name"),
                "value": cookie.get("value")
            }
            self.driver.add_cookie(cookie_dict)
        print("###載入 cookie 成功###")

    # 登陸
    def login(self):
        # 如果為 0，模擬登陸一下
        if self.login_method == 0:
            self.driver.get(login_url)
        elif self.login_method == 1:
            # 如果當前目錄底下沒有 cookie.pkl 這個文件
            if not os.path.exists("cookies.pkl"):
                # 登入 -> 掃碼登入，並記錄 cookie
                self.set_cookies()
            else:
                self.driver.get(target_url)
                # 登入，通過 selenium 傳入一些用戶訊息
                self.get_cookie()

    # 打開瀏覽器
    def enter_concerts(self):
        print("""###打開瀏覽器，進入大麥網###""")
        self.login()  # 調用 login 登入
        self.driver.refresh()
        self.status = 2
        print("###登入成功###")

    """
    搶票並下單
    """

    # TODO:
    #  1. 自動輸入高會的代碼
    #  2. 新增 [日期、場次、票黨、數量] 等選擇判斷
    #  3. 如果出現 [彈窗、廣告] 處理方法

    # 選票按鈕
    def buy_button_click(self):
        buy_button = self.driver.find_element(By.CLASS_NAME, "buy-link").text  # 判斷購買按鈕
        # TODO: 更多按鈕識別可能性判斷
        if buy_button == "不，选座购买":
            self.driver.find_element(By.CLASS_NAME, "buy-link").click()
        else:
            self.status = 5

    # 選票操作 -> [日期、場次、票黨、數量] 等選擇判斷
    def choose_ticket(self):
        all_ticket = self.driver.find_elements(By.CLASS_NAME, "skuname")

        # TODO: 完善排序
        for i in range(self.want_ticket_num, 0, -1):
            # ticket_judgment = all_ticket[i]
            if all_ticket[i].is_enabled():
                all_ticket[i].click()
                # TODO: 完善跳過缺貨
                break

    # 選座位
    def choose_seat(self):
        if self.status == 2:
            print("###開始場次和票價選擇###")

            # TODO: [座位選擇判斷 / 直接下單] 的邏輯完善
            title = self.driver.title

            if title == "选座购买" or "选择座位":
                return
            elif title == "确认订单":
                return
            # 實現下單邏輯
            # while True:
            #     print("###正在加載###")
            #     self.check_order()
            #     break


# TODO: 觀影人填選等等
# 確認訂單
def check_order(self):
    print("###開始確認訂單###")


if __name__ == "__main__":
    con = Concerts()
    con.enter_concerts()
    con.choose_ticket()
    con.buy_button_click()
    # con.choose_seat()
