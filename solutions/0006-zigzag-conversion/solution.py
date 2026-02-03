class Solution:
    def convert(self, s: str, numRows: int) -> str:
        row=numRows
        mat=[[] for _ in range(row+1)]
        l=len(s)
        a=0
        r=0
        while(l!=0):
            l=l-1
            if(r<row):
                mat[r].append(s[a])
                a=a+1
                r=r+1
            elif(r==(row)):
                r=r-1
                if(r==0):
                    r=r+1
                while(r!=0):
                    r=r-1
                    if(a==len(s)):
                        break
                    mat[r].append(s[a])
                    a=a+1
                r=r+1
            if(a==len(s)):
                break
        rst=""
        for i in mat:
            for j in i:
                rst=rst+j
        return rst
