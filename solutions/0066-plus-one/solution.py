class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        l=len(digits)
        a=""
        for i in range(0,l):
            a=a+str(digits[i])
        b=int(a)        
        c1=b+1
        c=str(c1)
        d=[]
        print(c)
        for i in c:
            print(i)
            e=int(i)
            d.append(e)
        print(d)
        return d

