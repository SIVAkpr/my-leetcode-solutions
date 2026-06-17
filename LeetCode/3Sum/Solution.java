1class Solution:
2    def threeSum(self, nums: List[int]) -> List[List[int]]:
3        n=nums
4        res=[]
5        n.sort()
6        l=len(n)
7        for i in range(l-2):
8            if i>0 and n[i]==n[i-1]:
9                continue
10            left=i+1
11            right=l-1
12            while left<right:
13                s=n[i]+n[left]+n[right]
14                if s==0:
15                    res.append([n[i],n[left],n[right]])
16                    while left<right and n[left]==n[left+1]:
17                        left=left+1
18                    while left<right and n[right]==n[right-1]:
19                        right-=1
20                    left+=1
21                    right-=1
22                elif s<0:
23                    left+=1
24                else:
25                    right-=1
26        return res