#include <stdlib.h>
#include <stdio.h>

int main(void)
{
    int dollar, sum = 0; // 初始化變數 sum 為 0
    printf("請輸入電量度數:");
    scanf("%d", &dollar);
    if (dollar >= 81)
    {
        int eight = dollar - 80;
        sum = sum + (eight * 22);
        dollar -= eight;
    }
    if (dollar >= 61 && dollar <= 80)
    {
        int sixty = dollar - 60;
        sum = sum + (sixty * 18);
        dollar -= sixty;
    }
    if (dollar >= 21 && dollar <= 60)
    {
        int twenty = dollar - 20;
        sum = sum + (twenty * 12);
        dollar -= twenty;
    }
    if (dollar <= 20 && dollar >= 1)
    {
        sum = sum + (dollar * 10);
    }
    printf("本月電費共%d元", sum); // 修改輸出變數為 sum
    system("PAUSE");
    return 0;
}
