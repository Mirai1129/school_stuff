#include <iostream>

#define MAX 80
// ◆設計一C++程式，利用堆疊方式寫出中序式轉後序式。
// ◆堆疊法思路:使用迴圈取出中序式的元素，遇運算元直接輸出，
// 遇到運算子與左括號進行堆疊，堆疊中運算子優先順序若大於等於讀入的運算子優先順序，直接輸出堆疊中的運算子，
// 再將讀入的運算子置入堆疊；遇右括號輸出堆疊中的運算子至左括號。

void InfixToPostFix(char *, char *);

int priority(char);

void InfixToPostFix(char *infix, char *postfix) {
    char stack[MAX] = {'\0'};
    int i, j, top;
    for (i = 0, j = 0, top = 0; infix[i] != '\0'; i++)
        switch (infix[i]) {
            case '(':
                stack[++top] = infix[i];
                break;
            case '+':
            case '-':
            case '*':
            case '/':
                while (priority(stack[top]) >= priority(infix[i])) {
                    postfix[j++] = stack[top--];
                }
                stack[++top] = infix[i];
                break;
            case ')':
                while (stack[top] != '(') {
                    postfix[j++] = stack[top--];
                }
                top--;
                break;
            default:
                postfix[j++] = stack[top--];
        }
    while (top > 0) {
        postfix[j++] = stack[top--];
    }
}

int priority(char op) {
    switch (op) {
        case '+':
        case '-':
            return 1;
        case '*':
        case '/':
            return 2;
        default:
            return 0;
    }
}

int main() {
    char infix[MAX] = {'\0'};
    char postfix[MAX] = {'\0'};
    printf("中序運算式：");
    scanf("%s", infix);
    InfixToPostFix(infix, postfix);

    int i;
    for (i = 0; postfix[i] != '\0'; i++) {
        printf("%c", postfix[i]);
    }
    return 0;
}
