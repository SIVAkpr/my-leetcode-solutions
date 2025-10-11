class Solution:
    def longestSubarray(self, nums: List[int]) -> int:
        n=nums
        l=len(n)
        if l<3:
            return l
        m_len=2
        c_len=2
        for i in range(2,l):
            if (n[i]==(n[i-1]+n[i-2])):
                c_len=c_len+1
                m_len=max(m_len,c_len)
            else:
                c_len=2
        return m_len
                
