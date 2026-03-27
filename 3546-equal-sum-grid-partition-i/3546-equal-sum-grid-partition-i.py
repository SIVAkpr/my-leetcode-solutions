class Solution:
    def canPartitionGrid(self, grid: List[List[int]]) -> bool:
        m,n=len(grid),len(grid[0])
        total=sum(sum(i) for i in grid)
        if total%2:
            return False
        half=total//2
        prefix=0
        for i in range(m-1):
            prefix+=sum(grid[i])
            if prefix==half:
                return True
        col=[0]*n
        for row in grid:
            for j in range(n):
                col[j]+=row[j]
        prefix=0
        for j in range(n-1):
            prefix+=col[j]
            if prefix==half:
                return True
        return False
        # a=sum(grid[0])
        # if(len(grid)==1):
        #     print(len(grid[0]))
        #     x=grid[0][0]
        #     for i in range(len(grid[0])):
        #         if x!=grid[0][i]:
        #             return False
        #     return True
        # for i in grid:
        #     if a!=sum(i):
        #         return False
        # return True