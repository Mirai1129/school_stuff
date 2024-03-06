'''
使用者可以自己輸入6個數字
然後利用程式產生大樂透一組中獎號碼，號碼為6個1~49之間的數字，
並由小到大顯示，根據自己輸入的數字利用for迴圈與樂透數字相比，最終顯示中獎金額&數字
'''
import random

answer = []#有6個數字
while len(answer) != 6:
    answer = []
    for i in range(0, 6):
        str1 = random.randint(1, 49)
        if str1 not in answer:
            answer.append(str1)
            answer.sort()
# print(str1, answer)

guess = list(map(int, input("請輸入6個數字:").split()))
guess.sort()
# print(guess)

a = 0
for i in range(0, 6):
    if guess[i] in answer:
        a += 1
#print(a)
if a == 0:
    print("沒中")
else:
    print(10**(a+1))

# import random
# lt,ip=sorted(random.sample(range(1,49),6)),[int(input("請輸入一個數字(1~49):")) for _ in range(6)]
# win=sorted(list(set(ip).intersection(lt)))
# print("開獎號碼為 "+" ".join(list(map(str,lt))))
# if win:
#     print("你中了"+str(10**(len(win)+1))+" 中獎數字為 "+" ".join(list(map(str,win))))
# else:
#     print("你沒中獎")