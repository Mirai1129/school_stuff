import random
points = ['A', '2', '3', '4', '5', '6', '7', '8', '9', '10', 'J', 'Q', 'K']
kinds = ['S', 'H', 'D', 'C']
cards = []


def poker():
    for i in kinds:
        for j in points:
            cards.append(i+j)
    random.shuffle(cards)  # 洗牌
    target_cards = random.choices(cards, k=10)
    player = []
    for _ in range(4):
        player.append(random.choices(cards, k=5))
    score = [0, 0, 0, 0]
    for i in range(0, 5):
        if player[0][i] in target_cards:
            score[0] += 1
        if player[1][i] in target_cards:
            score[1] += 1
        if player[2][i] in target_cards:
            score[2] += 1
        if player[3][i] in target_cards:
            score[3] += 1
    winner = [i for i in range(len(score)) if score[i] == max(score)]
    winner = [i + 1 for i in winner]
    print("{}\n\n{}\n\n{}\n\n{}".format(cards, target_cards, player, score))
    print("winner is player {}".format(str(winner)[1:-1]))


poker()
