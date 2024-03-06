arr = [70, 22 ,30 ,57 ,24 ,68 ,33 ,41]
#[70,68,57,41,33,30,24,22]


def a(arr):
    n = len(arr)
    while n > 1: #確定長度有沒有超過一個字
        n -= 1 #要減掉一個才能跑回圈
        for i in range(n):
            if arr[i] < arr[i+1]:
                arr[i+1], arr[i] =arr[i], arr[i+1]
    return arr

print(a(arr))