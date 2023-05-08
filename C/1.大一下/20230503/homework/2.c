/*續上題，老師想要知道是否有人考59分，請利用二分搜尋法判定是否有59分的同學*/
#include <stdlib.h>
#include <stdio.h>
#include <time.h>

#define NUM_STUDENTS 50

int binary_search(int arr[], int left, int right, int target)
{
    if (left > right)
    {
        return -1; // 若left > right，表示找不到target，回傳-1
    }
    int mid = left + (right - left) / 2;
    if (arr[mid] == target)
    {
        return mid; // 找到target，回傳索引值
    }
    else if (arr[mid] > target)
    {
        return binary_search(arr, mid + 1, right, target); // 在左半邊搜尋
    }
    else
    {
        return binary_search(arr, left, mid - 1, target); // 在右半邊搜尋
    }
}

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

    // 判斷是否有59分的同學
    int index = binary_search(classList, 0, NUM_STUDENTS - 1, 59);
    if (index != -1)
    {
        printf("有59分的同學，其索引值為%d\n", index);
    }
    else
    {
        printf("沒有59分的同學\n");
    }
    system("PAUSE");
    return 0;
}
