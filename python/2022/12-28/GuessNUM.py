import random


playtime = 0
ans = []  # 答案
for i in range(4):
    ans = random.sample(range(1, 10), 4)

while playtime != 10:
    guess = list(map(int, input("number:").split()))
    try:
        if len(guess) != 4 and guess == 0:
            raise ValueError
    except ValueError:
        print("只能輸入4個數字喔!!!")
        continue
    if guess[0] == 0:
        print("中斷遊戲")
        break
    playtime += 1
    A = 0
    B = 0
    for i in range(4):
        if guess[i] in ans:
            if guess[i] == ans[i]:
                A += 1
            if not guess[i] == ans[i]:
                B += 1
    if A == 4:
        print("4A!!!猜中了!!! 你猜了{}次".format(playtime))
        break
    else:
        print("{}A {}B 已猜{}次".format(A, B, playtime))
if playtime == 10:
    print("猜{}次了 {}A {}B".format(playtime, A, B))
    print(ans)
