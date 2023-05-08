#include <stdio.h>
#include <stdlib.h>

int move_count = 0;
void hanoi(int, char, char, char);

void hanoi(int n, char A, char B, char C)
{
    if (n > 0)
    {
        hanoi(n - 1, A, C, B);
        printf("移動盤子 %d 從柱 %c 到柱 %c\n", n, A, C);
        move_count++;
        hanoi(n - 1, B, A, C);
    }
}

int main()
{
    int n;
    printf("請輸入盤數：");
    scanf("%d", &n);
    hanoi(n, 'A', 'B', 'C');
    printf("共移動了 %d 次\n", move_count);
    system("PAUSE");
    return 0;
}
