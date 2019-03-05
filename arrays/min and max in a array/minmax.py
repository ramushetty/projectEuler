 
t = int(input())
for i in range(t):
    asi = int(input())
    listt = list(map(int, input().split()))
    print(max(listt), min(listt))