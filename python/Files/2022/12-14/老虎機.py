import random

def tigermachine():
    prize = 0
    big_prize = {"7": 10000, "apple": 500, "banana": 1000, "6": 5000}
    reel_1 = random.choice(list(big_prize.items()))
    reel_2 = random.choice(list(big_prize.items()))
    reel_3 = random.choice(list(big_prize.items()))
    if reel_1[0] ==  reel_2[0] == reel_3[0]:
        prize = reel_1[1]**3
    if reel_1[0] == reel_2[0] and reel_1[0] != reel_3[0]:
        prize = reel_1[1]**2 + reel_3[1]
    if reel_1[0] == reel_3[0] and reel_1[0] != reel_2[0]:
        prize = reel_1[1]**2 + reel_2[1]
    if reel_2[0] == reel_3[0] and reel_1[0] != reel_2[0]:
        prize = reel_2[1]**2 + reel_1[1]
    if reel_1[0] != reel_2[0] and reel_1[0] != reel_3 and reel_2[0] != reel_3[0]:
        prize = reel_1[1] + reel_2[1] + reel_3[1]
    print(reel_1[0], reel_2[0], reel_3[0])
    print(prize)


tigermachine()