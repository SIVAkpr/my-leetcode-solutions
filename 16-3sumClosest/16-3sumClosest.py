# Last updated: 3/21/2026, 3:41:22 PM
class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        t=target
        n=sorted(nums)
        clo_sum=sys.maxsize
        l=len(n)
        for i in range(l-2):
            left,right=i+1,l-1
            while left<right:
                cur_sum=n[i]+n[left]+n[right]
                if abs(cur_sum-t)<abs(clo_sum-t):
                    clo_sum=cur_sum
                if cur_sum==t:
                    return cur_sum
                elif cur_sum<t:
                    left+=1
                else:
                    right-=1
        return clo_sum