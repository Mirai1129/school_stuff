#include <stdlib.h>
#include <stdio.h>

int main(void)
{
    char Input;
    printf("請輸入一個字元:");
    scanf("%c", &Input);
    if (Input >= 'A' && Input <= 'Z')
    {
        printf("大寫英文字母\n");
    }
    else if (Input >= 'a' && Input <= 'z')
    {
        printf("小寫英文字母\n");
    }
    else if (Input >= '0' && Input <= '9')
    {
        printf("阿拉伯數字\n");
    }
    else
    {
        printf("未知類型\n");
    }
    system("PAUSE");
    return 0;
}
