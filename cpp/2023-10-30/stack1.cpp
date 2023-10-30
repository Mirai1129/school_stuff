#include <iostream>
#include <stack>

using namespace std;

int main() {
    stack<int> myStack;
    int inputData;

    for (int i = 0; i < 10; ++i) {
        cout << "輸入第" << i + 1 << "筆推入的資料:";
        cin >> inputData;
        myStack.push(inputData);
    }

    for (int i = 0; i < 10; ++i) {
        cout << "堆疊彈出的順序為:" << myStack.top() << endl;
        myStack.pop();
    }
    return 0;
}
