import random
List = [1, 28, 95, 63, 47, 10, 9, 5]
random.shuffle(List)


def a(arr):
    n = len(arr)
    while n > 1:  # 確定長度有沒有超過一個字
        n -= 1  # 要減掉一個才能跑回圈
        for i in range(n):
            if arr[i] > arr[i+1]:
                arr[i], arr[i+1] = arr[i+1], arr[i]
    return arr


print(a(List))
