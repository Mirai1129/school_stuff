import random
ans = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
guess = []
for i in range(1000):
    a = random.randint(0, 9)
    b = random.randint(0, 9)
    ans[a], ans[b] = ans[b], ans[a]
anslist = ans[:4]
print(anslist)  # 顯示出答案比較好測試
a = 0
b = 0
while a != 4:
    guess = list(map(int, input("number:").split()))
    a = 0
    b = 0
    counter = 0
    counter2 = []
    for i in range(4):
        if guess[i] == anslist[i]:
            a += 1
            counter2.append(guess[i])
    for i in range(4):
        if guess[i] in anslist:
            if not (guess[i] in counter2) and guess[i] != anslist[i]:
                b += 1
                counter2.append(guess[i])
        count = (a*25+b*15)
    print(a, "A", b, "B", count, "分")
