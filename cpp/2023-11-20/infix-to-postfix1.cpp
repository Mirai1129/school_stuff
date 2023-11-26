#include <iostream>
#include <stack> // 引入標準庫中的stack資料結構

using namespace std;

#define MAX_SIZE 20 // 定義最大大小

void InfixToPostfix(char infix[]); // 中序轉後序的函式

int Priority(char op); // 優先權的函式

int main() {
    char itemSet[MAX_SIZE];

    cout << "請輸入中序式：";
    cin >> itemSet;

    InfixToPostfix(itemSet);

    return 0;
}

void InfixToPostfix(char Stack[]) {
    int i = 0;
    int top = -1; // 堆疊頂端
    char op;

    cout << "後序式結果：";

    while (Stack[i] != '\0') { // 迭代輸入的中序式字元
        op = Stack[i]; // 取得目前字符

        switch (op) {
            case '(':
                top++; // 堆疊指標往上移
                Stack[top] = op; // 把 '(' 推入堆疊
                break;
            case '+':
            case '-':
            case '*':
            case '/':
                while (top >= 0 && Priority(Stack[top]) >= Priority(op)) { // 若堆疊頂部有高於或等於當前運算子的運算子，則輸出它們
                    cout << Stack[top];
                    top--;
                }
                top++;
                Stack[top] = op; // 把目前的運算子推入堆疊
                break;
            case ')':
                while (top >= 0 && Stack[top] != '(') { // 如果遇到')'，則將堆疊中 '(' 前的運算子輸出
                    cout << Stack[top];
                    top--;
                }
                if (top >= 0) {
                    top--; // 移除 '('
                }
                break;
            default:
                cout << op; // 輸出運算元
                break;
        }
        i++; // 移至下一個字元
    }
    while (top >= 0) { // 將堆疊中剩餘的運算子輸出
        cout << Stack[top];
        top--;
    }
    cout << endl;
}

int Priority(char op) {
    switch (op) { // 根據運算子優先級，返回數字，用於判斷運算子的優先順序
        case '+':
        case '-':
            return 1;
        case '*':
        case '/':
            return 2;
        default:
            return 0; // 預設的優先級
    }
}
