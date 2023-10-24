#include "iostream"
#include <iomanip>

using namespace std;

void printStar();

void multiply();

void printStar() {
    string stars(80, '*');
    cout << stars << endl;
}

void multiply() {
    for (int i = 1; i <= 9; i++) {
        for (int j = 1; j <= 9; j++) {
            cout << i << "*" << j << " = " << setw(2) << i * j << " ";
            // cout << i << "*" << j << " = " << (i * j < 10 ? " ":"") << i*j << " ";
        }
        cout << endl;
    }
}

int main() {
    printStar();
    multiply();
    printStar();
    return 0;
}
