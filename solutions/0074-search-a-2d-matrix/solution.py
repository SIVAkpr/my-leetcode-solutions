class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m=matrix
        for i in m:
            for j in i:
                if j==target:
                    return True
                    break
        return False
