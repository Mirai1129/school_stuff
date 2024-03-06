import time

# 測量第一部分的執行時間
start1 = time.perf_counter()
list1 = []
for i in range(6):
    list1.append(i)
end1 = time.perf_counter()
execution_time1 = end1 - start1

# 測量第二部分的執行時間
start2 = time.perf_counter()
list2 = [x for x in range(6)]
end2 = time.perf_counter()
execution_time2 = end2 - start2

# 印出結果
print(list1, execution_time1)
print(list2, execution_time2)
