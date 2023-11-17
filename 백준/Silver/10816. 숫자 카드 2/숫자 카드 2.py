N = int(input())
N_list = sorted(list(map(int, input().split())))
M = int(input())
M_list = list(map(int, input().split()))
M_chk = [0] * M  

def binary_search(N_list, target, left, right):
    if left > right:
        print(0,end=' ')
        return
    mid = (left+right)//2
    if N_list[mid] == target:
        print(cnt.get(target),end=' ')
    elif N_list[mid] > target:
        binary_search(N_list, target, left, mid-1)
    elif N_list[mid] < target:
        binary_search(N_list, target, mid+1, right)
    else:
        return

# 해당 target에 따른 개수를 찾기 위해 dict 추가 구성
cnt = {}
for i in N_list:
    if i in cnt:
        cnt[i] += 1
    else:
        cnt[i] = 1

left = 0
right = N-1

for i in range(M):
    binary_search(N_list, M_list[i], left, right)