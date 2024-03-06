def triangle_mid(a):
    b = a-1
    c = 1
    for i in range(0, a):
        print(" "*b, "*"*c)
        c += 2
        b -= 1
#a:幾層 b:左邊的空格 c:星星數
# def triangle_mid(a):
#     b = a-1
#     for i in range(0, a):
#         print(" "*b, "*"*(i+1))
#         a += 1
#         b -= 1

def triangle_upsidedown_mid(a):
    b = 0
    for i in range(0, a):
        print(" "*b, "*"*(a*2-1))
        a -= 1
        b += 1

def triangle_right(a):
    b = 0
    for i in range(0, a):
        print(" "*b, "*"*a)
        a -= 1
        b += 1
    
a = int(input())
triangle_mid(a)
print('')
triangle_upsidedown_mid(a)
print('')
triangle_right(a)
print('')
triangle_mid(a)
triangle_upsidedown_mid(a)