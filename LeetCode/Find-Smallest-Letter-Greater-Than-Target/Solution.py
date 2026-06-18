1class Solution:
2    def nextGreatestLetter(self, letters: List[str], target: str) -> str:
3        l,r=0,len(letters)-1
4        idx1=-1
5        # t=ord(target)-ord('a')
6        # print(t)
7        while l<=r:
8            mid=(l+r)//2
9            # a=ord(letters[mid])-ord('a')
10            # if letters[mid] < target:
11            #     l=mid+1
12            if letters[mid] > target:
13                idx1=mid
14                r=mid-1
15            else:
16                l=mid+1
17        if idx1!=-1:
18            return letters[idx1]
19        else:
20            return letters[0]
21