from collections import deque
import sys
sys.setrecursionlimit(10**6)

N = int(input())

# 그래프 입력
graph = []
for _ in range(N):
    graph.append(list(map(int, input().split())))        

# 그래프 최대 찾기
g_max = 0     
for i in range(N):
    for j in range(N):
        if graph[i][j] > g_max:
            g_max = graph[i][j]

# dfs
def dfs(x,y,num):
    dx = [1,-1,0,0]
    dy = [0,0,1,-1]
    
    if x < 0 or y < 0 or x >= N or y >= N:
        return False
    
    if not visited[x][y] and graph[x][y] > num:
        visited[x][y] = True
        for idx in range(4):
            newX = x + dx[idx]
            newY = y + dy[idx]
            dfs(newX,newY,num)
        return True
    return False

# main    
ans_list = []
for num in range(g_max):
    visited = [[False]*N for _ in range(N)]
    ans = 0
    for i in range(N):
        for j in range(N):
            if dfs(i,j,num):
                ans += 1
    ans_list.append(ans)
print(max(ans_list))