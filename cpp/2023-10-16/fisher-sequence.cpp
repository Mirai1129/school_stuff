#include "iostream"

using namespace std;

int RabbitBorn(int);

int RabbitBorn(int months) { // Clang-Tidy: Function 'RabbitBorn' is within a recursive call chain
    if (months == 0) {
        return 0;
    }
    if (months == 1) {
        return 1;
    }
    return RabbitBorn(months - 2) + RabbitBorn(months - 1);
}

int main() {
    int months;
    cout << "請輸入一個數字：";
    cin >> months;
    if (months < 0) {
        cout << "請輸入大於等於零的數字";
    } else {
        for (int i = 1; i <= months; ++i) {
            cout << "f(" << i << ")=" << RabbitBorn(i) << endl;
        }
    }
    return 0;
}
