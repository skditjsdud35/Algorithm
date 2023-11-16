n = int(input())
m = int(input())

# 0. 그래프 선언
graph = [[] for i in range(n+1)]
visited = [0] * (n+1)

# 1. 그래프에 정보 입력
for i in range(m):
    a, b = map(int, input().split())
    # 연결되어 있으면 무조건 감염이니까 양방향 입력 
    graph[a].append(b)
    graph[b].append(a)

def dfs(graph, visited, i):
    visited[i] = 1

    for j in graph[i]:
        if visited[j] == 0:
            dfs(graph, visited, j)

dfs(graph, visited, 1)
print(sum(visited) - 1)