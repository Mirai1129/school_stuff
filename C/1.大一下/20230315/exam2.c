#include <stdlib.h>
#include <stdio.h>

int main(void)
{
    int Month;
    printf("請輸入月份:");
    scanf("%d", &Month);

    if (Month >= 1 && Month <= 12)
    {
        switch (Month)
        {
        case 3:
        case 4:
        case 5:
            printf("%d月份是春季\n", Month);
            break;

        case 6:
        case 7:
        case 8:
            printf("%d月份是夏季\n", Month);
            break;

        case 9:
        case 10:
        case 11:
            printf("%d月份是秋季\n", Month);
            break;

        case 12:
        case 1:
        case 2:
            printf("%d月份是冬季\n", Month);
            break;

        default:
            printf("沒這個月份\n");
            break;
        }
    }
    else
    {
        printf("輸入非法值\n");
    }

    system("PAUSE");
    return 0;
}
