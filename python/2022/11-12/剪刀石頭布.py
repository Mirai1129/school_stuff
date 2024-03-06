import random

user = 0 #使用者猜的拳
score_user = 0 #使用者分數
score_computer = 0#電腦分數
for i in range(0, 5):
    user = input('')
    if user == "剪刀":
        user = 1
    elif user == "石頭":
        user = 2
    elif user == "布":
        user = 3
    computer = random.randint(1, 3)
    if user == computer:
        print('平手')
    elif ((computer == 1 and user == 3) or (computer == 2 and user == 1) or (computer == 3 and user == 2)):
        print("電腦獲勝")
        score_computer += 1
    else:
        print("玩家獲勝")
        score_user += 1
if score_user > score_computer:
    print("玩家獲勝")
else:
    print("電腦獲勝")