t = int(input())
for i in range(t):
    s = int(input())
    arr = list(map(int, input().split()))
    ele = int(input())
    count = 0
    for k in arr:
        if k <= ele:
            count += 1
    print(count)