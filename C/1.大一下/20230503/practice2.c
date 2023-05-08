#include <stdlib.h>
#include <stdio.h>

int main(void)
{
    int data[] = {26, 5, 81, 7, 63};
    int i, j, temp;
    int flag = 0;
    for (j = 0; (j < 5) && (!flag); j++)
    {
        flag = 1;
        for (i = 0; i < (5 - j); i++)
        {
            if (data[i] > data[i + 1])
            {
                temp = data[i];
                data[i] = data[i + 1];
                data[i + 1] = temp;
                flag = 0;
            }
        }
    }

    for (i = 0; i < 5; i++)
    {
        printf("%d ", data[i]);
    }

    system("PAUSE");
    return 0;
}
