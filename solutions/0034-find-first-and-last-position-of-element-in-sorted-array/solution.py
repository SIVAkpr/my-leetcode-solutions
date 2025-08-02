class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        n=[]
        c=[]
        b=[0,0]
        a=[-1,-1]
        if (len(nums))>1:
            for i in range(len(nums)):
                if nums[i]==target:
                    n.append(i)
                if target not in nums:
                    return a
            if len(n)==2:
                return n
            elif len(n)>2:
                c.append(n[0])
                c.append(n[-1])
                return c
            else:
                n.append(n[0])
                return n
        elif (len(nums)==1) and target in nums:
            return b
        else:
            return a
