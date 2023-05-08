'''
arr=[50, 30, 90, 10, 70]
請將氣泡排序法寫在副程式中
並呼叫此副程式對arr進行氣泡排序(小到大)
氣泡排序法請用for或是while迴圈撰寫，禁止使用sort函式
'''
arr=[50, 30, 90, 10, 70]

def a(arr):
    n = len(arr)
    while n > 1: #確定長度有沒有超過一個字
        n -= 1 #要減掉一個才能跑回圈
        for i in range(n):
            if arr[i] > arr[i+1]:
                arr[i], arr[i+1] = arr[i+1], arr[i]
    return arr

print(a(arr))
