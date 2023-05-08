#include <stdlib.h>
#include <stdio.h>

/*
若 f ( n ) = 2f(n-1) -5 且  f( 0 )=3
請用遞迴方式撰寫程式讓使用者輸入一個整數 n 後, 輸出 f( n )的結果
*/

int f(int);

int main(void)
{
    int n;
    printf("請輸入整數n:");
    scanf("%d", &n);
    printf("%d\n", f(n));
    system("PAUSE");
    return 0;
}

int f(int n)
{
    if (n > 0)
    {
        return (2 * f(n - 1) - 5);
    }
    else
    {
        return 3;
    }
}
