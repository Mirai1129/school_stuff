#include <stdio.h>
#include <stdlib.h>

int judge(int num) {
    if (num <= 1) {
        return 0;
    }
    for (int i = 2; i < num; i++) {
        if (num % i == 0) { // 如果能被 2 或 num - 1 之間的數整除，就不是質數
            return 0;
        }
    }
    return 1;
}

int main() {
    int n;
    // 輸入數字，get num
    printf("請輸入一個值：");
    scanf("%d", &n);

    // 如果是質數就 print 是質數，反之
    if (judge(n)) {
        printf("%d是質數。\n", n);
    } else {
        printf("%d不是質數。\n", n);
    }
    return 0;
}
