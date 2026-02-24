class Solution:
    def countOperationsToEmptyArray(self, nums: List[int]) -> int:
        # n=deque(nums)
        # rst=0
        # i=0
        # n1=sorted(nums)
        # while n:
        #     if n[0] == n1[i]:
        #         n.popleft()
        #         rst += 1
        #         i += 1
        #     else:
        #         n.append(n.popleft())
        #         rst += 1
        # return rst
        n = len(nums)
        rst = n
        numToIndex = {}
        for i, num in enumerate(nums):
            numToIndex[num] = i
        nums.sort()
        for i in range(1, n):
            if numToIndex[nums[i]] < numToIndex[nums[i - 1]]:
                rst += n - i
        return rst
        # mi=min(n)
        # while n:
        #     if n[0]==mi:
        #         n.popleft()
        #         if n:
        #             mi=min(n)
        #         rst+=1
        #     else:
        #         n.append(n.popleft())
        #         rst+=1

