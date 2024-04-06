def prime_factors(n):
    factors = []
    divisor = 2

    while n > 1:
        while n % divisor == 0:
            factors.append(divisor)
            n //= divisor
        divisor += 1

    return factors
    

def printarr(arr):
    for i in range(len(arr)):
        print(arr[i], end=" ")
    print()

s = input()[::-1]
ans=[]
space = [2, 2, 2, 2, 2]
for c in s:
    if (c==" "):
        ans.extend(space)
    else:
        ans.extend(prime_factors(ord(c)))
print(len(ans))
printarr(ans)