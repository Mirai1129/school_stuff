/*��W�D�A�Ѯv�Q�n���D�O�_���H��59���A�ЧQ�ΤG���j�M�k�P�w�O�_��59�����P��*/
#include <stdlib.h>
#include <stdio.h>
#include <time.h>

#define NUM_STUDENTS 50

int binary_search(int arr[], int left, int right, int target)
{
    if (left > right)
    {
        return -1; // �Yleft > right�A��ܧ䤣��target�A�^��-1
    }
    int mid = left + (right - left) / 2;
    if (arr[mid] == target)
    {
        return mid; // ���target�A�^�ǯ��ޭ�
    }
    else if (arr[mid] > target)
    {
        return binary_search(arr, mid + 1, right, target); // �b���b��j�M
    }
    else
    {
        return binary_search(arr, left, mid - 1, target); // �b�k�b��j�M
    }
}

int main(void)
{
    srand(time(NULL));
    int classList[NUM_STUDENTS], num;
    int i, j, temp = 0, flag = 0, rank[NUM_STUDENTS] = {0};

    // �H���ͦ��ǥͦ��Z
    for (i = 0; i < NUM_STUDENTS; i++)
    {
        num = (rand() % 101);
        classList[i] = num;
    }
    // �ϥΫ_�w�ƧǶi��ƦW
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

    // �T�w�C��ǥͪ��ƦW
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

    // �L�X�ǥͦ��Z
    for (i = 0; i < NUM_STUDENTS; i++)
    {
        printf("%d ", classList[i]);
    }
    printf("\n");
    // �L�X�e���W���Z
    printf("���Z�G");
    for (i = 0; i < NUM_STUDENTS && rank[i] < 5; i++)
    {
        printf("%3d ", classList[i]);
    }
    printf("%3d\n", classList[24]);
    printf("�ƦW�G");
    for (i = 0; i < NUM_STUDENTS && rank[i] < 5; i++)
    {
        printf("%3d ", rank[i] + 1);
    }
    printf("%3d\n", rank[24] + 1);

    // �P�_�O�_��59�����P��
    int index = binary_search(classList, 0, NUM_STUDENTS - 1, 59);
    if (index != -1)
    {
        printf("��59�����P�ǡA����ޭȬ�%d\n", index);
    }
    else
    {
        printf("�S��59�����P��\n");
    }
    system("PAUSE");
    return 0;
}
