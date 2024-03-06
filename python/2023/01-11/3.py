data = {}
data2 = {'B': 'banana', 'C': 'cherry'}
data.setdefault('A', 'apple')  # .setdefault()
print(data)
data.update(data2)  # .updata()
print(data)
del data['A']  # del
print(data)
data.clear()  # 刪除、清除字典內所有的鍵
print(data)
data = {'D': 'drinks', 'E': 'elephant'}  # 修改、更改字典
data['D'] = "drunk"
print(data)
data2 = data.copy()  # 複製字典的內容到另一字典
print(data)
