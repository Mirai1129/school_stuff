def NoRepeated(numbers):
    norepeatlist = []
    for i in range(0, len(numbers)):
        if numbers[i] not in norepeatlist:
            norepeatlist.append(numbers[i])
    print(norepeatlist)

a = [1, 2, 3, 2, 1]
b = [9, 9, 3, 6, 3, 0]
NoRepeated(a)
NoRepeated(b)
# def NoRepeated(numbers):
#     print(list(set(numbers)))