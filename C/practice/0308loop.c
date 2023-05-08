#include <stdio.h>
#include <stdlib.h>

/*
1
22
333
4444
55555

****1
***123
**12345
*1234567
123456789

*/
int main(void)
{
    int i, j;

    for (i = 1; i <= 5; i++)
    {
        for (j = 1; j <= i; j++)
        {
            printf("%d", i);
        }
        printf("\n");
    }

    int n = 5;
    for (i = 1; i <= n; i++)
    {
        for (j = 4; j >= i; j--)
        {
            printf("*");
        }
        for (j = 1; j <= i * 2 - 1; j++)
        {
            printf("%d", j);
        }
        printf("\n");
    }

    system("PAUSE");
    return 0;
}
