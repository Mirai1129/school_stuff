#include <stdlib.h>
#include <stdio.h>

int main(void)
{
    /*公因數*/
    int num1, num2, min;
    printf("請輸入兩個數字:");
    scanf("%d,%d", &num1, &num2);
    if (num1 > num2)
    {
        min = num2;
    }
    else
    {
        min = num1;
    }
    int i;
    for (i = 2; i <= min; i++)
    {
        if (num1 % i == 0 && num2 % i == 0)
        {
            printf("%d ", i);
        }
    }

    printf("\n");
    /*金字塔*/
    int k;
    for (k = 1; k <= 10; k++)
    {
        for (i = 1; i <= k; i++)
        {
            printf("*");
        }
        printf("\n");
    }

    /*加總*/
    printf("\n");
    int num;
    printf("input a number:");
    scanf("%d", &num);
    int sum = 0;
    for (i = 1; i <= num; i++)
    {
        sum = sum + i;
    }
    printf("1 to %d sum is %d\n", num, sum);

    sum = 0;
    for (i = 1; i <= num; i++)
    {
        if ((i % 2) != 0)
        {
            sum = sum + i;
        }
    }
    printf("1 to %d sum of odd numbers is %d\n", num, sum);

    sum = 0;
    i = 1;
    while (i <= num)
    {
        if (i % 2 == 0)
        {
            sum = sum + i;
        }
        i += 1;
    }
    printf("1 to %d sum of even numbers is %d\n", num, sum);
    system("PAUSE");
    return 0;
}
