#include <stdlib.h>
#include <stdio.h>
#include <time.h>

int main(void)
{
    int num;
    srand(time(NULL));
    int i, j, studentList[10][4];
    int mathHigh[1][2] = {{0, 0}}, mathA = 0, mathSum = 0, mathLow[10][2] = {0};
    int chineseHigh[1][2] = {{0, 0}}, chineseA = 0, chineseSum = 0, chineseLow[10][2] = {0};
    int englishHigh[1][2] = {{0, 0}}, englishA = 0, englishSum = 0, englishLow[10][2] = {0};

    // num
    for (i = 0; i < 10; i++)
    {
        studentList[i][0] = i + 1;
    }

    // math
    for (i = 0; i < 10; i++)
    {
        num = (rand() % 100);
        studentList[i][1] = num;
        mathSum += num;
    }
    mathA = mathSum / 10;
    for (i = 0; i < 10; i++)
    {
        if (studentList[i][1] < mathA)
        {
            mathLow[i][0] = studentList[i][0];
            mathLow[i][1] = studentList[i][1];
        }
        if (mathHigh[0][1] < studentList[i][1])
        {
            mathHigh[0][0] = studentList[i][0];
            mathHigh[0][1] = studentList[i][1];
        }
    }

    // chinese
    for (i = 0; i < 10; i++)
    {
        num = (rand() % 100);
        studentList[i][2] = num;
        chineseSum += num;
    }
    chineseA = chineseSum / 10;
    for (i = 0; i < 10; i++)
    {
        if (studentList[i][2] < chineseA)
        {
            chineseLow[i][0] = studentList[i][0];
            chineseLow[i][1] = studentList[i][2];
        }
        if (chineseHigh[0][1] < studentList[i][2])
        {
            chineseHigh[0][0] = studentList[i][0];
            chineseHigh[0][1] = studentList[i][2];
        }
    }

    // english
    for (i = 0; i < 10; i++)
    {
        num = (rand() % 100);
        studentList[i][3] = num;
        englishSum += num;
    }
    englishA = englishSum / 10;
    for (i = 0; i < 10; i++)
    {
        if (studentList[i][3] < englishA)
        {
            englishLow[i][0] = studentList[i][0];
            englishLow[i][1] = studentList[i][3];
        }
        if (englishHigh[0][1] < studentList[i][3])
        {
            englishHigh[0][0] = studentList[i][0];
            englishHigh[0][1] = studentList[i][3];
        }
    }

    // print students score
    for (i = 0; i < 10; i++)
    {
        printf("%2d ", studentList[i][0]);
        for (j = 1; j < 4; j++)
        {
            printf("%3d ", studentList[i][j]);
        }
        printf("\n");
    }
    printf("\n");

    // print Highest score
    printf("Math Highest: %2d %3d\n", mathHigh[0][0], mathHigh[0][1]);
    printf("Chinese Highest: %2d %3d\n", chineseHigh[0][0], chineseHigh[0][1]);
    printf("English Highest: %2d %3d\n", englishHigh[0][0], englishHigh[0][1]);
    printf("\n");

    // print Lower than average
    printf("Math Average: %d\n", mathA);
    for (i = 0; i < 10; i++)
    {
        if (mathLow[i][0] != 0)
        {
            printf("%2d %3d\n", mathLow[i][0], mathLow[i][1]);
        }
    }
    printf("chinese Average: %d\n", chineseA);
    for (i = 0; i < 10; i++)
    {
        if (chineseLow[i][0] != 0)
        {
            printf("%2d %3d\n", chineseLow[i][0], chineseLow[i][1]);
        }
    }
    printf("english Average: %d\n", englishA);
    for (i = 0; i < 10; i++)
    {
        if (englishLow[i][0] != 0)
        {
            printf("%2d %3d\n", englishLow[i][0], englishLow[i][1]);
        }
    }
    system("PAUSE");
    return 0;
}
