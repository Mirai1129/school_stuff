#include <stdlib.h>
#include <stdio.h>

int main(void)
{
    int n, i, j, k;
    printf("n=");
    scanf("%d", &n);
    for (i = 1; i <= n; i++)
    {
        for (j = 1; j <= i; j++)
        {
            printf("%d", j);
        }
        printf("\n");
    }
    for (i = 1; i <= n; i++)
    {
        for (k = n - 1; k >= i; k--)
        {
            printf(" ");
        }

        for (j = 1; j <= i; j++)
        {
            printf("%d", j);
        }
        printf("\n");
    }

    system("PAUSE");
    return 0;
}
