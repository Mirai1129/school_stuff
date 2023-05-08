'''
電費100度(含)以下時，1度電10塊錢
電費大於100度(不含)且小於200度(含)以下時，1度電20塊錢
若大於200度(不含)，1度電都是30塊錢 
請利用for迴圈讓使用者輸入3次用電度數，並顯示該次電費多少錢。
'''
for i in range(0, 3):
    election = int(input(''))
    if election <= 100:
        print('$', election * 10)
    elif 100 < election and election <= 200:
        print('$', election * 20)
    elif 200 < election:
        print('$', election * 30)
