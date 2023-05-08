a = int(input())
if a in range(1, 1001):
    if a % 2 == 0:
        print("偶數")
    else:
        print("奇數")
else:
    print("請輸入1~1000的數字")