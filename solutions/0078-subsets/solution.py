class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        lst=[[]]
        for num in nums:
            lst+=[i+[num] for i in lst]
        return lst
        # for i in range(len(nums)+1):
        #     for j in range(i+1,len(nums)+1):
        #         lst.append(nums[i:j])
        # return sorted(lst,key=sum)
