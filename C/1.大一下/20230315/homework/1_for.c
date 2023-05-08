#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    int n, i = 1, sum = 0;

    printf("請輸入n值(n>O):");
    scanf("%d", &n);
    while (n < 0)
    {
        printf("請輸入大於1的值\n");
        printf("請輸入n值(n>O):");
        scanf("%d", &n);
    }

    for (i = 1; i <= n; i++)
    {
        sum = sum + i;
    }

    printf("1+2+...+%d=%d\n", n, sum);
    system("pause");
    return 0;
}