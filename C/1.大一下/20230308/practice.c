#include <stdlib.h>
#include <stdio.h>

#define POSITIVE 1
#define NEGATIVE -1
#define ZERO 0

int main(void)
{
    int num1, num2;
    char oper;
    printf("請輸入一個算式(1 + 1):");
    scanf("%d %c %d", &num1, oper, &num2);

    switch (oper)
    {
    case '+':
        printf("%d+%d=%d\n", num1, num2, (num1 + num2));
        break;
    case '-':
        printf("%d-%d=%d\n", num1, num2, (num1 - num2));
        break;
    case '*':
        printf("%d*%d=%d\n", num1, num2, (num1 * num2));
        break;
    case '/':
        printf("%d/%d=%.3f\n", num1, num2, (float)(num1 / num2));
        break;
    default:
        printf("無法辨識的算式!!!");
        break;
    }

    system("pause");
    return 0;
}
