class Solution:
    def numSpecial(self, mat: List[List[int]]) -> int:
        m=mat
        row_sum=[sum(r) for r in m]
        col_sum=[sum(c) for c in zip(*m)]
        print(row_sum,col_sum)
        cnt=0
        for i in range(len(m)):
            for j in range(len(m[0])):
                if m[i][j]==1 and row_sum[i]==1 and col_sum[j]==1:
                    cnt+=1
        return cnt

