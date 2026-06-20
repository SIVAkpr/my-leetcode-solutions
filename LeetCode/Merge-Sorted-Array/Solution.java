1class Solution:
2    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
3        """
4        Do not return anything, modify nums1 in-place instead.
5        """
6        a=0
7        for index,i in reversed(list(enumerate(nums1))):
8            if i == 0 and a!=n:
9                nums1[index]=nums2[a]
10                a=a+1
11        nums1.sort()
12        print(nums1)
13