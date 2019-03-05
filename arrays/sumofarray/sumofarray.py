t = int(input())
for i in range(t):
    s = int(input())
    listt = list(map(int, input().split()))
    print(sum(listt))

# t = int(input());
# while t > 0:
#     t = t-1;
#     n = int(input());
#     arr = [int(i) for i in input().split()];
#     sum = 0;
#     for x in arr:
#         sum = sum + x;
#     print(sum);