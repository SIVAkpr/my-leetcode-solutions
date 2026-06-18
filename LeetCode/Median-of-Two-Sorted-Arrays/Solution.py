1class Solution:
2    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
3        b=nums1+nums2
4        num=sorted(b)
5        l=len(num)
6       # print(b)
7        if (l%2)!=0:
8            a=int((l+1)/2)
9         #   print(a)
10            if l>2:
11                z=num[a-1]
12           #     print(z)
13            else:
14                z=num[0]
15        else:
16            a=int((l/2)-1)
17            c=int((l/2))
18            print(c)
19            if l>=2:
20                z=(num[a]+num[c])/2
21            else:
22                z=num[0]
23        return z