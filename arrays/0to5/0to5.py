def revconvertFive(n):
    if n == 0:
        return 0
    else :
        f = n % 10 
        if f == 0:
            f = 5
        return revconvertFive(n//10)*10 + f  

def convertFive(n):
    if n == 0:
        return 5
    else :
        return revconvertFive(n) 

if __name__=='__main__':
    t = int(input())
    for i in range(t):
        print (convertFive(int(input().strip())))



# def convertFive(n):
#     m = str(n)
#     return m.replace("0","5")
# {
# # Your code goes here
# if __name__=='__main__':
#     t = int(input())
#     for i in range(t):
#         print (convertFive(int(input().strip())))
# }

# ''' Please note that it's Function problem i.e.
# you need to write your solution in the form of Function(s) only.
# Driver Code to call/invoke your function is mentioned above. '''

# # Function should return an integer value
# def convertFive(n):
#     if n == 0 :
#         return 5
#     else :
#         return convertt(n)
# def convertt(n):
#     if n == 0:
#         return 0
#     else:
#         f = n%10
#         if f == 0:
#             f = 5
#     return convertt(n//10)*10 + f

#   