# Last updated: 3/21/2026, 3:41:33 PM
class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        b=nums1+nums2
        num=sorted(b)
        l=len(num)
       # print(b)
        if (l%2)!=0:
            a=int((l+1)/2)
         #   print(a)
            if l>2:
                z=num[a-1]
           #     print(z)
            else:
                z=num[0]
        else:
            a=int((l/2)-1)
            c=int((l/2))
            print(c)
            if l>=2:
                z=(num[a]+num[c])/2
            else:
                z=num[0]
        return z