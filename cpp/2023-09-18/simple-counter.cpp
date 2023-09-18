#include <iostream>

using namespace std;

int main() {
    char symbol;
    double num1, num2;

    cout << "input the symbols + - * /:";
    cin >> symbol;
    cout << "input the numbers:";
    cin >> num1 >> num2;

    switch (symbol) {
        case '+':
            cout << num1 + num2;
            break;
        case '-':
            cout << num1 - num2;
            break;
        case '*':
            cout << num1 * num2;
            break;
        case '/':
            if (num2 != 0) {
                cout << num1 / num2;
            } else {
                cout << "The divisor cannot be zero." << endl;
                break;
            }
        default:
            cout << "error, please input the correct symbol";
            break;
    }

    return 0;
}
