#include <stdio.h>

#define MAX_STACK_SIZE 10

int stack[MAX_STACK_SIZE];
int top = -1;

void push(int);

void pop();

void output();

void push(int value) {
    if (top == MAX_STACK_SIZE - 1) {
        printf("堆疊已滿，無法推入新元素。\n");
        return;
    }
    stack[++top] = value;
    printf("已Push值：%d\n", value);
}

void pop() {
    if (top == -1) {
        printf("堆疊為空，無法執行pop。\n");
        return;
    }
    int value = stack[top--];
    printf("從堆疊中pop值：%d\n", value);
}

void output() {
    if (top == -1) {
        printf("堆疊為空，無法輸出。\n");
        return;
    }
    printf("輸出堆疊：\n");
    for (int i = top; 0 <= i; i--) {
        printf("%d\n", stack[i]);
    }
}

int main() {
    int choice, inputData;

    while (1) {
        printf("1.Push\n2.Pop\n3.Output\n4.Exit\n");
        printf("選擇：");
        scanf("%d", &choice);
        switch (choice) {
            case 1:
                printf("請輸入要推入的值：");
                scanf("%d", &inputData);
                push(inputData);
                break;
            case 2:
                pop();
                break;
            case 3:
                output();
                break;
            case 4:
                return 0;
            default:
                printf("無效的選擇。請再次輸入。\n");
        }
    }
}
