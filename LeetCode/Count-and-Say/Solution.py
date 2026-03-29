1class Solution:
2    def countAndSay(self, n: int) -> str:
3        def map_freq(val):
4            if not val:
5                return []
6            curr=val[0]
7            cnt=1
8            rst=[]
9            for i in range(1,len(val)):
10                if val[i]==curr:
11                    cnt+=1
12                else:
13                    rst.append([curr,str(cnt)])
14                    curr=val[i]
15                    cnt=1
16            rst.append([curr,str(cnt)])
17            return rst
18        def join_freq(arr):
19            rst=""
20            for i in arr:
21                rst+="".join(i[::-1])
22            return rst
23        b='1'
24        while n>1:
25            a=map_freq(b)
26            b=join_freq(a)
27            n-=1
28        return b
29        