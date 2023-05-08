#include <stdlib.h>
#include <stdio.h>
#include <time.h>

#define NUM_STUDENTS 50

int main(void)
{
    srand(time(NULL));
    int classList[NUM_STUDENTS], num;
    int i, j, temp = 0, flag = 0, rank[NUM_STUDENTS] = {0};

    // 隨機生成學生成績
    for (i = 0; i < NUM_STUDENTS; i++)
    {
        num = (rand() % 101);
        classList[i] = num;
    }
    // 使用冒泡排序進行排名
    for (i = 0; i < NUM_STUDENTS - 1; i++)
    {
        flag = 1;
        for (j = 0; j < NUM_STUDENTS - i - 1; j++)
        {
            if (classList[j] < classList[j + 1])
            {
                temp = classList[j];
                classList[j] = classList[j + 1];
                classList[j + 1] = temp;
                flag = 0;
            }
        }
        if (flag)
            break;
    }

    // 確定每位學生的排名
    for (i = 0; i < NUM_STUDENTS; i++)
    {
        for (j = 0; j < NUM_STUDENTS; j++)
        {
            if (classList[i] < classList[j])
            {
                rank[i]++;
            }
        }
    }

    // 印出學生成績
    for (i = 0; i < NUM_STUDENTS; i++)
    {
        printf("%d ", classList[i]);
    }
    printf("\n");
    // 印出前五名成績
    printf("成績：");
    for (i = 0; i < NUM_STUDENTS && rank[i] < 5; i++)
    {
        printf("%3d ", classList[i]);
    }
    printf("%3d\n", classList[24]);
    printf("排名：");
    for (i = 0; i < NUM_STUDENTS && rank[i] < 5; i++)
    {
        printf("%3d ", rank[i] + 1);
    }
    printf("%3d\n", rank[24] + 1);

    system("PAUSE");
    return 0;
}
