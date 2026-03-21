# Last updated: 3/21/2026, 3:41:07 PM
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dic={}
        for i in strs:
            l=[0]*26
            for j in i:
                l[ord(j)-ord('a')]+=1
            t=tuple(l)
            if t in dic:
                dic[t].append(i)
            else:
                dic[t]=[i]
        k=[]
        for i in dic:
            k.append(dic[i])
        return k