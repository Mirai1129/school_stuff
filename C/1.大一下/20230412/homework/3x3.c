#include <stdlib.h>
#include <stdio.h>
#include <time.h>

int main(void)
{
    int i, j, num, data[3][3], rowSum[3], diagonal1, diagonal2;
    float rowAverage[3];
    srand(time(NULL));
    for (i = 0; i < 3; i++)
    {
        rowSum[i] = 0;
        for (j = 0; j < 3; j++)
        {
            num = (rand() % 50) + 1;
            data[i][j] = num;
            rowSum[i] += data[i][j];
            rowAverage[i] = rowSum[i] / 3;
            printf("%2d ", data[i][j]);
        }
        printf("\n");
    }
    for (i = 0; i < 3; i++)
    {
        printf("第%d列: %d 平均: %.2f\n", i + 1, rowSum[i], rowAverage[i]);
    }

    diagonal1 = data[0][0] + data[1][1] + data[2][2];
    diagonal2 = data[0][2] + data[1][1] + data[2][0];
    printf("對角線: %d, %d\n", diagonal1, diagonal2);
    system("PAUSE");
    return 0;
}
