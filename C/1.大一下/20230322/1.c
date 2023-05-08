#include <stdlib.h>
#include <stdio.h>

int main(void)
{
    int n;
    printf("請輸入整數:");
    scanf("%d", &n);
    for (int i = 2; i <= n; i++)
    {
        int is_prime = 1; // 0不是質數，反之
        for (int j = 2; j < i; j++)
        {
            if (i % j == 0)
            {
                is_prime = 0;
                break;
            }
        }
        if (is_prime)
        {
            printf("%d ", i);
        }
    }
    system("PAUSE");
    return 0;
}
