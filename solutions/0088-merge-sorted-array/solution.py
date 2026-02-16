class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        a=0
        for index,i in reversed(list(enumerate(nums1))):
            if i == 0 and a!=n:
                nums1[index]=nums2[a]
                a=a+1
        nums1.sort()
        print(nums1)

