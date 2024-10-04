n = int(input())
ans = 1000000

for i in range(n):
    for j in range(n):
        if 3*i + 5*j == n and i + j < ans:
                ans = i + j
                
if ans != 1000000:
    print(ans)
else:
    print(-1)