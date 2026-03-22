1class Solution:
2    def minAbsDiff(self, grid: List[List[int]], k: int) -> List[List[int]]:
3        g=grid
4        m=len(g)-k+1
5        n=len(g[0])-k+1
6        lst=[[0]*n for i in range(m)]
7        print(lst)
8        for i in range(m):
9            for j in range(n):
10                lst2=[]
11                for x in range(i,i+k):
12                    for y in range(j,j+k):
13                        lst2.append(g[x][y])
14                lst2.sort()
15                minn=min((abs(a - b) for a, b in pairwise(lst2) if a != b),default=0)   
16                lst[i][j]=minn
17        return lst
18