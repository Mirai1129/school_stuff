#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    int i, j;

    // 第一部分：數字三角形
    for (i = 1; i <= 5; i++)
    {
        for (j = 1; j <= i; j++)
        {
            printf("%d", i);
        }
        printf("\n");
    }

    // 第二部分：星號數字三角形
    int n = 5;
    for (i = 1; i <= n; i++)
    {
        // 印出星號
        for (j = 1; j <= n - i; j++)
        {
            printf("*");
        }

        // 印出數字
        for (j = 1; j <= 2 * i - 1; j++)
        {
            printf("%d", j);
        }
        printf("\n");
    }

    system("PAUSE");
    return 0;
}
