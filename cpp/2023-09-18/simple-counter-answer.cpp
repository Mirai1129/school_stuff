#include <iostream>

using namespace std;

int main() {
    char method;
    double num1, num2;
    double result;

    // 讓使用者可以輸入運算子以及數字
    cout << "請輸入計算方式：" << "";
    cin >> method;
    cout << "請輸入想計算的兩個值：" << "";
    cin >> num1 >> num2;

    // 判斷是否為運算子，如果是其中一個那就針對那個運算子運算
    switch (method) {
        case '+':
            result = num1 + num2;
            break;
        case '-':
            result = num1 - num2;
            break;
        case '*':
            result = num1 * num2;
            break;
        case '/':
            // Variable 'result' is used uninitialized whenever 'if' condition is false
            // 這邊應該要把 result = 0
            if (num2 != 0) {
                // value is never used
                result = num1 / num2;
            } else {
                cout << "除數不能為零。" << endl;
                break;
            }
        default:
            cout << "無效的操作符。" << endl;
            return 1;
    }
    // 輸出結果
    cout << "" << result << endl;
    return 0;
}
