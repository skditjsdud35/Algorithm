N = int(input())
N_list = sorted(list(map(int, input().split())))
M = int(input())
M_list = list(map(int, input().split()))

def binary_search(arr, target, left, right):
    if left > right:
        print("0")
        return
    mid = (left + right) // 2
    if arr[mid] == target:
        print("1")
        return
    elif arr[mid] > target:
        binary_search(arr, target, left, mid-1)
    elif arr[mid] < target:
        binary_search(arr, target, mid+1, right)
        
left = 0
right = N-1
for i in range(M):
    binary_search(N_list, M_list[i], left, right)
