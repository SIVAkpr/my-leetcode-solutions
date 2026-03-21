class Solution:
    def reverse(self, x: int) -> int:
        n=x
        q=""
        s=0
        c=0
        if n>=0:
            e=n
            while(n!=0):
                a=n%10
                q=q+str(a)
                q1=int(q)
                n=n/10
                n=int(n)
                c=c+1
            if(e==0) or q1>(2147483647):
                return 0
            else:
                return int(q)
        else:
            n=n*(-1)
            while(n!=0):
                a=n%10
                q=q+str(a)
                n=n/10
                n=int(n)
                c=c+1
                print(c)
            q=int(q)*(-1)
            if q<=(-2147483648):
                return 0
            else:
                return q
        

