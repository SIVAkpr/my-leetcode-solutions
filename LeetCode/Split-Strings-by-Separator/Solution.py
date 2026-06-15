1class Solution:
2    def splitWordsBySeparator(self, words: List[str], separator: str) -> List[str]:
3        s=separator
4        w=words
5        lst=[]
6        for i in w:
7            sp=i.split(s)
8            for j in sp:
9                if j !="":
10                    lst.append(j)
11        return lst