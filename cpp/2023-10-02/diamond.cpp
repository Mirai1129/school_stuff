#include <iostream>

using namespace std;

void triangle(int n) {
    for (int i = n - 1; i >= 0; i--) {
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
    triangle(layer);
}
