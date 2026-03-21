# Last updated: 3/21/2026, 3:40:27 PM
class Solution:
    def triangleNumber(self, nums: List[int]) -> int:
        ans=0
        n=nums
        n.sort()
        for i in range(len(n)-1,1,-1):
            left=0
            right=i-1
            while(left<right):
                if n[left]+n[right]>n[i]:
                    ans += right - left
                    right-=1
                else:
                    left+=1
        return ans