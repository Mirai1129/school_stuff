#include <stdlib.h>
#include <stdio.h>

int score(void);
int searchList(void);

int score(void)
{
    int i, score, count = 0, sum = 0;
    float A_score = 0;
    while (1)
    {
        printf("input a score(0 = stop the program):");
        scanf("%d", &score);
        if (score == 0)
        {
            break;
        }
        sum += score;
        count++;
        A_score = sum / count;
        printf("score is: %d\n", score);
    }
    printf("Average score is: %.2f\n", A_score);
}

int searchList(void)
{
    int i, flag = 0, num;
    int A[6] = {11, 22, 33, 44, 55, 66};
    for (i = 0; i < 6; i++)
    {
        printf("%d\n", A[i]);
    }
    while (1)
    {
        printf("the num you wanna search for:");
        scanf("%d", &num);
        for (i = 0; i < 6; i++)
        {
            if (num == A[i])
            {
                printf("found it!!! its %d\n", num);
                flag = 1;
                break;
            }
        }
        if (flag == 0)
        {
            printf("can't find it\n");
        }
    }
}

int main(void)
{
    system("PAUSE");
    return 0;
}
