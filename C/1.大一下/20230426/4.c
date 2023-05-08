#include <stdlib.h>
#include <stdio.h>

int math(int);

int math(int n)
{
    if (n == 0)
    {
        return 3; // f(0) = 3
    }
    else
    {
        return 2 * math(n - 1) - 5;
    }
}

int main()
{
    int n;
    printf("請輸入一個整數 n：");
    scanf("%d", &n);
    printf("%d\n", math(n));
    system("PAUSE");
    return 0;
}
