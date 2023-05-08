#include <stdlib.h>
#include <stdio.h>

/*
撰寫 int mod(int x, int y) 函數, 計算 x / y 的餘數。

在主程式要求使用者輸入兩個整數, 並呼叫 mod函數後輸出結果

使用者可一直輸入兩個整數, 直到使用者輸入y=0 時程式結束
*/

int mod(int, int);

int main(void)
{
    int X, Y = 1; // Y 的初始值設為 1
    while (Y != 0)
    {
        printf("請輸入X和Y:");
        scanf("%d %d", &X, &Y); // 逗號改成空格
        if (Y == 0)
        {
            break;
        }

        printf("%d\n", mod(X, Y));
    }

    system("PAUSE");
    return 0;
}

int mod(int x, int y)
{
    int result;
    result = x % y;
    return result;
}
