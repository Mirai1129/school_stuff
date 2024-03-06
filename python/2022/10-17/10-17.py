'''
由系統隨機生成一個0~100之間的亂數
並利用迴圈讓使用者不斷輸入數字(input)猜此亂數（亂數不可顯示出來）
直到猜出來為止
例：亂數為50
若輸入40，則顯示亂數在40~100之間
假設輸入值為x
(若輸入的數字小於亂數，顯示亂數在x到100之間)
若輸入60，則顯示亂數在0~60之間
(若輸入的數字大於亂數，顯示亂數在0到x之間)
若第一次輸入40，第二次輸入60
則顯示該亂數介於40~60之間
若猜中亂數，則顯示答對了~並跳出迴圈(如何跳出迴圈請Google，此為這次作業的挑戰)
'''
import random

lowest = 0
highest = 100
guess = 0
answer = random.randint(0, 100)
while True:
    guess = int(input(''))
    if answer == guess:
        print('答對了~')
        break
    elif answer < guess:
        highest = guess
        print(lowest, highest)
    elif answer > guess:
        lowest = guess
        print(lowest, highest)