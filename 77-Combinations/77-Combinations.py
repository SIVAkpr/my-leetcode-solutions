# Last updated: 3/21/2026, 3:40:57 PM
class Solution:
    def combine(self, n: int, k: int) -> List[List[int]]:
        rst=[]
        def backtrack(start,ctcomb):
            if len(ctcomb)==k:
                rst.append(list(ctcomb))
                return
            for i in range(start,n+1):
                ctcomb.append(i)
                backtrack(i+1,ctcomb)
                ctcomb.pop()
        
        backtrack(1,[])
        return rst