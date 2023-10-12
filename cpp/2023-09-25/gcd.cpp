#include <iostream>

using namespace std;

/*設計一C++程式能夠計算兩個數字的gcd(最大公因數)及lcd(最小公倍數)，
 * 使用while迴圈。Hint:gcd可用輾轉相除法，lcd=A*B/gcd。*/
int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

int lcm(int a, int b) {
    int gcdResult = gcd(a, b);
    return (a * b) / gcdResult;
}

int main() {
    int num1, num2, gcdResult, lcmResult;
    cout << "請輸入兩個數字：";
    cin >> num1 >> num2;
    gcdResult = gcd(num1, num2);
    lcmResult = lcm(num1, num2);
    cout << "最大公因數：" << gcdResult << endl;
    cout << "最小公倍數：" << lcmResult << endl;
    return 0;
}
