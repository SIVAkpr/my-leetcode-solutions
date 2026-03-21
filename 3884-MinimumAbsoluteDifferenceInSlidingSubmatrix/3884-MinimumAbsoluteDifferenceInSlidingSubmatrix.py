# Last updated: 3/21/2026, 3:39:09 PM
class Solution:
    def minAbsDiff(self, grid: List[List[int]], k: int) -> List[List[int]]:
        g=grid
        m=len(g)-k+1
        n=len(g[0])-k+1
        lst=[[0]*n for i in range(m)]
        print(lst)
        for i in range(m):
            for j in range(n):
                lst2=[]
                for x in range(i,i+k):
                    for y in range(j,j+k):
                        lst2.append(g[x][y])
                lst2.sort()
                minn=min((abs(a - b) for a, b in pairwise(lst2) if a != b),default=0)   
                lst[i][j]=minn
        return lst
