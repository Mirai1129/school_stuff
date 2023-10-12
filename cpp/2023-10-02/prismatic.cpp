#include <iostream>

using namespace std;

void diamond(int n) {

    // 上半部分的等腰三角形
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            cout << " ";
        }
        for (int j = 0; j < 2 * i + 1; j++) {
            cout << "*";
        }
        cout << endl;
    }

    // 下半部分的倒過來的等腰三角形
    for (int i = n - 2; i >= 0; i--) {
        for (int j = 0; j < n - i - 1; j++) {
            cout << " ";
        }
        for (int j = 0; j < 2 * i + 1; j++) {
            cout << "*";
        }
        cout << endl;
    }
}

int main() {
    int layer;
    printf("請輸入要印出的層數：");
    cin >> layer;
    diamond(layer);
}
