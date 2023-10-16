#include "iostream"

using namespace std;

int rabbitBorn(int);

int rabbitBorn(int months) { // Clang-Tidy: Function 'rabbitBorn' is within a recursive call chain
    if (months == 0) {
        return 0;
    }
    if (months == 1) {
        return 1;
    }
    return rabbitBorn(months - 2) + rabbitBorn(months - 1);
}

int main() {
    int months;
    cout << "請輸入一個數字：";
    cin >> months;
    cout << rabbitBorn(months);
    return 0;
}
