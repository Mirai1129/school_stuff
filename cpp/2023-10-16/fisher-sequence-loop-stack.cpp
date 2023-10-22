#include <iostream>

using namespace std;

int rabbitBorn(int);

int rabbitBorn(int months) {
    if (months == 0) {
        return 0;
    }

    int a = 0;
    int b = 1;

    for (int i = 2; i <= months; ++i) {
        int temp = b;
        b = a + b;
        a = temp;
    }

    return b;
}

int main() {
    int months;
    cout << "請輸入一個數字：";
    cin >> months;
    cout << rabbitBorn(months);
    return 0;
}
