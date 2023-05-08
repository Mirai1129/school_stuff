menu = []
while True:
    a = int(input('1新增項目至菜單, 2新增菜單到特定位置, 3新增多個項目至菜單, 4刪除菜單最後一項, 5結束\n請輸入模式:'))
    if a == 1:
        thing = input('請輸入想新增的項目')
        menu.append(thing)
        print(menu)
    elif a == 2:
        target = int(input('請輸入想新增的位置'))
        thing = input('請輸入想新增的項目')
        menu.insert(target, thing)
        print(menu)
    elif a == 3:
        thing = list(input('請輸入想新增的項目').split(' '))
        menu.extend(thing)
        print(menu)
    elif a == 4:
        menu.pop()
        print(menu)
    elif a == 5:
        break
print(menu)
