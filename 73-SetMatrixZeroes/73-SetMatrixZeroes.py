# Last updated: 3/21/2026, 3:41:00 PM
class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        r=len(matrix)
        c=len(matrix[0])
        m=matrix
        row,col=set(),set()
        for i,lst in enumerate(m):
            for j1,j in enumerate(lst):
                if j==0:
                    row.add(i)
                    col.add(j1)        
        for k in row:
            for l in range(c):
                m[k][l]=0
        for j in col:
            for l in range(r):
                m[l][j]=0