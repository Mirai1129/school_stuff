#include <stdlib.h>
#include <stdio.h>

/*提示使用者輸入四個使用者姓名、身高及體重
輸出使用者的姓名後輸出平均身高及平均體重 (小數點取到第二位)*/

int main(void)
{
    char name1[20], name2[20], name3[20], name4[20];
    int height1, height2, height3, height4;
    int weight1, weight2, weight3, weight4;
    float A_height, A_weight;

    printf("以下四位使用者姓名請用英文名字輸入\n");
    printf("請輸入使用者1姓名,身高,體重(用空格分開):");
    scanf("%s %d %d", name1, &height1, &weight1);
    fflush(stdin);
    printf("姓名:%s, 身高:%d, 體重:%d\n", name1, height1, weight1);

    printf("請輸入使用者2姓名,身高,體重(用空格分開):");
    scanf("%s %d %d", name2, &height2, &weight2);
    fflush(stdin);
    printf("姓名:%s, 身高:%d, 體重:%d\n", name2, height2, weight2);

    printf("請輸入使用者3姓名,身高,體重(用空格分開):");
    scanf("%s %d %d", name3, &height3, &weight3);
    fflush(stdin);
    printf("姓名:%s, 身高:%d, 體重:%d\n", name3, height3, weight3);

    printf("請輸入使用者4姓名,身高,體重(用空格分開):");
    scanf("%s %d %d", name4, &height4, &weight4);
    fflush(stdin);
    printf("姓名:%s, 身高:%d, 體重:%d\n", name4, height4, weight4);

    A_height = (float)(height1 + height2 + height3 + height4) / 4;
    A_weight = (float)(weight1 + weight2 + weight3 + weight4) / 4;
    printf("有%s, %s ,%s ,%s 這四位\n", name1, name2, name3, name4);
    printf("平均身高為:%.2f, 平均體重為%.2f\n", A_height, A_weight);

    system("PAUSE");
    return 0;
}
