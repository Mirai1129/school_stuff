#include <stdlib.h>
#include <stdio.h>

/*2. 寫出一程式，計算網路購物的運費，基本物流處理費199，1~5公斤，每公斤50元，
超過5公斤，每一公斤30元，使用者輸入購物重量後

計算和顯示所需運費+物流處理費*/

int main(void)
{
    int weight;
    printf("請輸入購物重量:");
    scanf("%d", &weight);

    int baseDollar = 199;
    if (1 <= weight && weight <= 5)
    {
        printf("這是你的運費:$%d\n", (baseDollar + (weight * 50)));
    }
    else
    {
        printf("這是你的運費:$%d\n", (baseDollar + (250 + (weight - 5) * 30)));
    }
    system("PAUSE");
    return 0;
}