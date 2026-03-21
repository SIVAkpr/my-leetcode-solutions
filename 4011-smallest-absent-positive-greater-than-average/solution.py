class Solution:
    def smallestAbsent(self, nums: List[int]) -> int:
        n=nums
        l=len(nums)
        avg=sum(nums)/l
        print(avg)
        a=int(avg)
        if a<0:
            a=0
        else:
            pass
        while(1):
            a=a+1
            if a in n:
                continue
            else:
                q=int(a)
                if q>0:
                    return int(a)
                    break
                else:
                    return 1
                
