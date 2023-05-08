#include <stdlib.h>
#include <stdio.h>

int main(void)
{
    int a, b, gcd, lcm;
    printf("請輸入兩個整數: ");
    scanf("A=%d B=%d", &a, &b);

    // 求最大公因數
    int temp_a = a, temp_b = b;
    while (temp_b != 0)
    {
        int temp = temp_b;
        temp_b = temp_a % temp_b;
        temp_a = temp;
    }
    gcd = temp_a;

    // 求最小公倍數
    lcm = a * b / gcd;

    // 輸出結果
    printf("gcd=%d  lcm=%d\n", gcd, lcm);
    system("PAUSE");
    return 0;
}
