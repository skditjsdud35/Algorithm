from collections import deque
N, M, V = map(int, input().split())

# 0.graph & visited 선언
graph = [[] for _ in range(N+1)]
d_visited = [False for _ in range(N+1)]
b_visited = [False for _ in range(N+1)]

# 1.graph에 정보 입력
for _ in range(M):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)
    graph[a].sort()
    graph[b].sort()
    
# 2-1.dfs
def dfs(i):
    d_visited[i] = True
    print(i,end=' ')
    for j in graph[i]:
        if not d_visited[j]:
            dfs(j)
    
# 2-2.bfs
def bfs(i):
    q = deque([i])
    b_visited[i] = True
    while q:
        v = q.popleft()
        print(v,end=' ')
        for j in graph[v]:
            if not b_visited[j]:
                q.append(j)
                b_visited[j] = True

# 3.main
dfs(V)
print()
bfs(V)

