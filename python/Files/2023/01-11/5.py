import random
a = ['a1', 'a2', 'a3', 'a4', 'a5', 'a6', 'a7', 'a8', 'a9', 'a10']
b = ['b1', 'b2', 'b3', 'b4', 'b5', 'b6', 'b7', 'b8', 'b9', 'b10']
c = ['c1', 'c2', 'c3', 'c4', 'c5', 'c6', 'c7', 'c8', 'c9', 'c10']
d = ['d1', 'd2', 'd3', 'd4', 'd5', 'd6', 'd7', 'd8', 'd9', 'd10']

storehouses = [a, b, c, d]
sell = []
for i in range(10):
    store = random.choice(storehouses)
    x = random.sample(store, 1)
    sell.append(x)
    store.remove(x[0])

for j in range(0, 10):
    print("第{}位客人買了{}商品\n".format(j+1, sell[j]))
for l in range(4):
    print("{}倉庫庫存剩下{}".format(
        [k for k, v in locals().items() if v == storehouses[l]][0], storehouses[l]))
