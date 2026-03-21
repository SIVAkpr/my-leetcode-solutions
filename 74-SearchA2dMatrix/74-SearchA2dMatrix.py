# Last updated: 3/21/2026, 3:40:59 PM
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m=matrix
        for i in m:
            for j in i:
                if j==target:
                    return True
                    break
        return False