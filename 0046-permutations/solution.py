class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        size=len(nums)
        a=nums
        q=[]
        def permu(a,size):
            if size==1:
                q.append(tuple(a))
            for i in range(size):
                permu(a,size-1)
                if size%2==1:
                    a[0],a[size-1]=a[size-1],a[0]
                else:
                    a[i],a[size-1]=a[size-1],a[i]
        permu(a,size)
        return q
