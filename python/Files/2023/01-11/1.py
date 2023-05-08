def triangle(layer):
    b = layer-1
    c = 1
    for i in range(0, layer):
        print(" "*b, "*"*c)
        c += 2
        b -= 1


def square(layer):
    for i in range(0, layer):
        for j in range(0, layer):
            print("*", end=' ')
        print()


def diamond(layer):
    b = layer-1
    c = 1
    for i in range(0, layer-1):
        print(" "*b, "*"*c)
        c += 2
        b -= 1
    b = 0
    for i in range(0, layer):
        print(" "*b, "*"*(layer*2-1))
        layer -= 1
        b += 1


def hourglass(layer):
    a = layer
    b = 0
    for i in range(0, layer):
        print(" "*b, "*"*(layer*2-1))
        layer -= 1
        b += 1
    b = a-1
    c = 1
    for i in range(0, a):
        print(" "*b, "*"*c)
        c += 2
        b -= 1


def triangle_upsidedown_mid(layer):
    b = 0
    for i in range(0, layer):
        print(" "*b, "*"*(layer*2-1))
        layer -= 1
        b += 1


a = int(input('1三角形, 2正方形, 3菱形, 4漏斗, 5奇怪的形狀\n請輸入形狀代號:'))
if a == 1:
    layers = int(input('請輸入層數'))
    triangle(layers)
elif a == 2:
    layers = int(input('請輸入層數'))
    square(layers)
elif a == 3:
    layers = int(input('請輸入層數'))
    diamond(layers)
elif a == 4:
    layers = int(input('請輸入層數'))
    hourglass(layers)
elif a == 5:
    layers = int(input('請輸入層數'))
    triangle_upsidedown_mid(layers)
