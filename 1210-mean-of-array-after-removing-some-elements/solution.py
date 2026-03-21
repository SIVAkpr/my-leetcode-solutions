class Solution(object):
    def trimMean(self, arr):
        """
        :type arr: List[int]
        :rtype: float
        """
        arr.sort()
        n=len(arr)
        N=int(n*0.05)
        trim=arr[N:n-N]
        return sum(trim)/float(len(trim))
        
