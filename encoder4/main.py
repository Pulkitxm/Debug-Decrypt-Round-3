def hghdbhbdhbhbhb(n):
    ahhsdbhsbhsbfhsf = []
    snnfuabfbsdjfb = 2

    while n > 1:
        while n % snnfuabfbsdjfb == 0:
            ahhsdbhsbhsbfhsf.append(snnfuabfbsdjfb)
            n //= snnfuabfbsdjfb
        snnfuabfbsdjfb += 1

    return ahhsdbhsbhsbfhsf
    

def shdfiuwhfiuwr(arr):
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
        ans.extend(hghdbhbdhbhbhb(ord(c)))
print(len(ans))
shdfiuwhfiuwr(ans)