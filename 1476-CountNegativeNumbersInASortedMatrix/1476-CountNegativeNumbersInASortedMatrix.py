# Last updated: 3/21/2026, 3:40:03 PM
class Solution:
    def countNegatives(self, grid: List[List[int]]) -> int:
        ans=0
        for i in grid:
            for j in i:
                if j<0:
                    ans+=1
        return ans
                