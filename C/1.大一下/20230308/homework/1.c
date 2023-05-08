#include <stdlib.h>
#include <stdio.h>

/*1. 寫出一程式，輸入x, y座標值，判斷該點位於哪一個象限或是在座標軸上。

舉例來說，若輸入的座標值為(3.0, -2.5) 則為第四象限，若輸入的座標值為(4.5, 0.0) 則輸出為 x 軸*/

int main(void)
{
    float X, Y;
    printf("請輸入座標(X , Y):");
    scanf("%f , %f", &X, &Y);

    if (X != 0 && Y != 0)
    {
        if (X > 0)
        {
            if (Y > 0)
            {
                printf("第一象限");
            }
            else
            {
                printf("第四象限");
            }
        }
        else
        {
            if (Y > 0)
            {
                printf("第二象限");
            }
            else
            {
                printf("第三象限");
            }
        }
    }
    else
    {
        if (X == 0 && Y == 0)
        {
            printf("原點(0, 0)");
        }
        else if (X == 0)
        {
            printf("在Y軸上");
        }
        else
        {
            printf("在X軸上");
        }
    }

    system("PAUSE");
    return 0;
}
