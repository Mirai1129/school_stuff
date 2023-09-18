#include <stdio.h>

int main() {
    int number;
    int isPrime = 1;
    printf("please input a number: ");
    scanf("%d", &number);
    if (number < 2) {
        isPrime = 0;
    } else {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = 0;
                break;
            }
        }
    }
    if (isPrime)
        printf("%d is prime。\n", number);
    else
        printf("%d is not prime。\n", number);
    return 0;
}
