# Last updated: 3/21/2026, 3:40:17 PM
class Solution:
    def addToArrayForm(self, num: List[int], k: int) -> List[int]:
        carry=0
        rst=[]
        index=len(num)-1
        while k>0 or index>=0:
            if index>=0:
                k+=num[index]
            carry,digit=divmod(k,10)
            rst.append(digit)
            k=carry
            index-=1
        return rst[::-1]