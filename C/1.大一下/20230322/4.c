#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(void)
{
    int amount, remainder, coin_10, coin_5, coin_1;
    double input;

    do
    {
        printf("請輸入欲提領的金額(需大於0且為整數)：");
        if (scanf("%lf", &input) != 1 || modf(input, &input) != 0 || input <= 0)
        {
            printf("輸入的金額不合法！\n");
            while (getchar() != '\n')
                ;        // 清空緩衝區
            amount = -1; // 設定 amount 為負值，觸發重新輸入
        }
        else
        {
            amount = (int)input;
        }
    } while (amount <= 0);

    coin_10 = amount / 10;   // 計算10元硬幣數量
    remainder = amount % 10; // 計算剩餘金額
    coin_5 = remainder / 5;  // 計算5元硬幣數量
    remainder %= 5;          // 計算剩餘金額
    coin_1 = remainder;      // 計算1元硬幣數量

    printf("需支付：\n");
    printf("%d 個 10元硬幣\n", coin_10);
    printf("%d 個 5元硬幣\n", coin_5);
    printf("%d 個 1元硬幣\n", coin_1);

    system("PAUSE");
    return 0;
}
