class Solution:
    def prefixesDivBy5(self, nums: List[int]) -> List[bool]:
        currentstate=0
        rst=[]
        for bit in nums:
            currentstate=(2*currentstate +bit)%5
            rst.append(currentstate==0)
        return rst
        
