#include <stdio.h>
#include <stdlib.h>
#include <conio.h> /*getche(), getch()*/

int main(void)
{
    int num1 = 12, num2 = 1024;
    float num3 = 12.3478f;
    /* - 靠左, + 顯示正負號, 空白 正數空一格 負數顯示負號, 0 在空的地方補0 */
    printf("num1 = %6d km\n", num1);                                           /*靠右佔六字元*/
    printf("num1 = %-6d km\n", num2);                                          /*靠左佔六字元*/
    printf("num1 = %6.2f km\n", num3);                                         /*靠右佔六字元 6.2f格式*/
    printf("Octal--->%o Decimal--->%d Hexadecimal--->%x\n", num1, num1, num1); /*八進位 十進位 十六進位*/

    int Input1, Input2;
    printf("type a 2 numbers(use','separate numbers):");
    scanf("%d,%d", &Input1, &Input2); /*輸入空白有可能會有錯誤*/
    printf("Input1 = %d, Input2 = %d\n", Input1, Input2);

    char name[10];
    printf("what's your name:");
    scanf("%s", &name); /*有時候會有緩衝區的問題*/
    printf("Your name is %s\n", name);
    fflush(stdin); /*所以要清空緩衝區*/

    char ch;
    printf("Type a Alphabet:");
    ch = getchar();
    printf("You typed the alphabet---> ");
    putchar(ch);
    putchar('\n');

    printf("Type a Alphabet(getche()):");
    ch = getche(); /*會輸出出來*/
    printf(", You typed the alphabet---> %c\n", ch);

    printf("Type a Alphabet(getch()):");
    ch = getch(); /*不會輸出出來*/
    printf(", You typed the alphabet---> %c\n", ch);

    system("pause");
    return 0;
}