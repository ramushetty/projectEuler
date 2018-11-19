a = int(input())
for i in range(a):
    n = int(input())
    powe = 2 ** n
    string = str(powe)
    sum = 0;
    for x in string:
        sum += int(x)
    print(sum)
