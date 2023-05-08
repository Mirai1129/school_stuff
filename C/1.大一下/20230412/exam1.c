#include <stdlib.h>
#include <stdio.h>

// 1. 給定一個整數，請反順序輸出該整數，例如輸入 654321，輸出123456 (限用遞迴呼叫的方式完成此程式)

void reverse(int);

void reverse(int num)
{
    if (num == 0)
    {
        return;
    }
    printf("%d", num % 10); // 輸出個位數
    reverse(num / 10);      // 因為輸出過第一個數字了 剩下後面的數字
}

int main(void)
{
    int num;
    printf("input a num:");
    scanf("%d", &num);
    reverse(num);
    system("PAUSE");
    return 0;
}
