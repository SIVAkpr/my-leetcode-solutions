1class Solution:
2    def countNegatives(self, grid: List[List[int]]) -> int:
3        ans=0
4        for i in grid:
5            for j in i:
6                if j<0:
7                    ans+=1
8        return ans
9                