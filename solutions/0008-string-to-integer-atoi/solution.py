class Solution:
    def myAtoi(self, s: str) -> int:
        sign=0
        s=s.strip()
        r=['0','1','2','3','4','5','6','7','8','9']
        print(s)
        if not s:
            return 0
        
        if s[0] == '-':
            sign = 1
            s = s[1:]
        elif s[0] == '+':
            s = s[1:]
        
        a=0
        
        for i in s:
            if i not in r:
                break
            a=(a*10)+int(i)
        if sign==1:
            a=a*-1
        print(a)

        INT_MAX = 2**31 - 1
        INT_MIN = -2**31
        
        if a < INT_MIN:
            return INT_MIN
        if a > INT_MAX:
            return INT_MAX

        return a
