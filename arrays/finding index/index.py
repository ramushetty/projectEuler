#code
t = int(input())
for i in range(t):
    s = int(input())
    arr = list(map(int, input().split()))
    ele = int(input())
    
    for k in range(s):
        if(ele == arr[k]):
            print(k,end=" ")
            break
    for k in range(s-1,-1,-1):
        if(ele == arr[k]):
            print(k)
            break





# for i in range(int(input())):
#     n=int(input())
#     lst=[int(x) for x in input().split()]
#     x=int(input())
#     a=lst.index(x)
#     lst.reverse()
#     b = lst.index(x)
#     c = (n-1)-b
#     print(a, c)