#include <stdlib.h>
#include <stdio.h>

int main(void)
{
    int elect;
    printf("請輸入電量度數:");
    scanf("%d", &elect);
    if (1 <= elect && elect <= 20)
    {
        printf("本月電費共%d", (elect * 10));
    }
    else if (21 <= elect && elect <= 60)
    {
        printf("本月電費共%d", (elect * 12));
    }
    else if (61 <= elect && elect <= 80)
    {
        printf("本月電費共%d", (elect * 18));
    }
    else if (elect >= 81)
    {
        printf("本月電費共%d", (elect * 22));
    }
    system("PAUSE");
    return 0;
}
