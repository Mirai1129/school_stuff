#include <stdlib.h>
#include <stdio.h>

void stars(void); // 要宣告函數原型
int addTwo(int, int);
int power(int, int);
int fac(int);

int main(void)
{
    int x = 10, y = 100, total;
    /*相加*/
    total = addTwo(x, y);
    printf("%d\n", total);

    /*星星*/
    stars();

    /*次方*/
    double doubleTotal;
    doubleTotal = power(2, 3);
    printf("%f\n", doubleTotal);

    /*遞迴*/
    int nFac = 4;
    printf("%d\n", fac(nFac));
    system("PAUSE");
    return 0;
}

void stars(void)
{
    printf("*\n");
    printf(" ** \n");
    printf("  *** \n");
}

int addTwo(int a, int b)
{
    int sum;
    sum = a + b;
    return sum;
}

int power(int a, int b)
{
    if (b == 0)
    {
        return 1;
    }
    else
    {
        return (a * power(a, b - 1));
    }
}

int fac(int n)
{
    if (n > 0)
    {
        return (n * fac(n - 1));
    }
    else
    {
        return 1;
    }
}
