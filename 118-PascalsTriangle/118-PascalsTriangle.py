# Last updated: 3/21/2026, 3:40:52 PM
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        r=numRows
        tri=[]
        tri.append([1])
        for i in range(1,r):
            row=[1]
            ans=tri[i-1]
            for j in range(1,i):
                row.append(ans[j-1]+ans[j])
            row.append(1)
            tri.append(row)
        return tri
            
