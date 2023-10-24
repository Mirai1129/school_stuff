#include <iostream>
#include <array>
#include <random>
#include <algorithm>

using namespace std;

array<int, 4> generateRandomNumber();

array<int, 4> guessNumberGame(array<int, 4>, array<int, 4>);

pair<int, int> showResult(array<int, 4>);

array<int, 4> generateRandomNumber() {
    random_device rd; // enable random number
    mt19937 gen(rd()); // 使用 Mersenne Twister 引擎，用於產生高品質亂數
    uniform_int_distribution<> dis(0, 9); // <random> 中的一個類模板，用於生成一個指定範圍內的均勻分佈的整數。

    array<int, 4> randomNumberArray{};

    for (int i = 0; i < 4; ++i) {
        int randomDigit;
        bool isDuplicate;

        do {
            randomDigit = dis(gen);
            isDuplicate = false;

            for (int j = 0; j < i; ++j) {
                if (randomNumberArray[j] == randomDigit) {
                    isDuplicate = true;
                    break;
                }
            }
        } while (isDuplicate);

        randomNumberArray[i] = randomDigit;
    }

    return randomNumberArray;
}

array<int, 4> guessNumberGame(array<int, 4> answer, array<int, 4> guess) {
    array<int, 4> resultArray{};

    for (int i = 0; i < 4; ++i) {
        if (guess[i] == answer[i]) {
            resultArray[i] = 1; // 正確的數字和位置
        } else if (find(answer.begin(), answer.end(), guess[i]) != answer.end()) {
            resultArray[i] = 2; // 正確的數字但位置不對
        } else {
            resultArray[i] = 0; // 數字不對
        }
    }

    return resultArray;
}

pair<int, int> showResult(array<int, 4> resultCount) {
    int a = 0, b = 0;
    for (int i = 0; i < 4; ++i) {
        if (resultCount[i] == 1) {
            a++;
        } else if (resultCount[i] == 2) {
            b++;
        }
    }
    return make_pair(a, b);
}

int main() {
    array<int, 4> randomNumber = generateRandomNumber();

    do {
        array<int, 4> userGuess{};
        cout << "請輸入一個四位數：";

        for (int i = 0; i < 4; ++i) {
            char digit;
            cin >> digit;
            userGuess[i] = digit - '0';
        }

        array<int, 4> gameResult = guessNumberGame(randomNumber, userGuess);
        pair<int, int> result = showResult(gameResult);
        cout << result.first << "A " << result.second << "B" << endl;

        if (result.first == 4) {
            cout << "\n恭喜你猜對了，遊戲結束！" << endl;
            break;
        }
    } while (true);

    return 0;
}
