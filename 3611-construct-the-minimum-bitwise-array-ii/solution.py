class Solution:
    def minBitwiseArray(self, nums: List[int]) -> List[int]:
        rst=[]
        for i in nums:
            if i==2:
                rst.append(-1)
            else:
                for bit_pos in range(1,32):
                    a=i>>bit_pos
                    # if(a | (a+1))==i:
                    if (a&1)^1:
                        rst.append(i ^ (1<<bit_pos-1))
                        break
        return rst
