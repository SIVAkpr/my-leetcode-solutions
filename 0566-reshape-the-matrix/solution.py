class Solution:
    def matrixReshape(self, mat: List[List[int]], r: int, c: int) -> List[List[int]]:
        lst=[]
        m=mat
        q=0
        a=[]
        for i in mat:
            for j in i:
                a.append(j)
        print(a)
        if len(a) != r * c:
            return mat
        for i in range(r):
            row=[]
            for j in range(c):
                row.append(a[q])
                q=q+1
            lst.append(row)
        return lst
