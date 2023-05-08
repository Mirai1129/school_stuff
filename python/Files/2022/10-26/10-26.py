import random

lowest = 0
highest = 100
answer = random.randint(0, 100)
while True:
    guess = input(':')
    try:
        guess = int(guess)
    except ValueError:
        print("錯誤!!!請輸入數值")
        continue
    guess = int(guess)
    if guess in range(lowest, highest+1):
        if answer == guess:
            print('答對了~')
            break
        elif answer < guess:
            highest = guess
            print(lowest, highest)
        elif answer > guess:
            lowest = guess
            print(lowest, highest)
    else:
        print("請輸入範圍內的數字")