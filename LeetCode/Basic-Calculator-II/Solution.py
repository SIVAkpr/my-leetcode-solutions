1class Solution:
2    def calculate(self, s: str) -> int:
3        stack=[]
4        prev_op='+'
5        cur_no=0
6        l=len(s)
7        for idx,ch in enumerate(s):
8            if ch.isdigit():
9                cur_no=cur_no*10+int(ch)
10            if idx==l-1 or ch in "+-*/":
11                if prev_op=='+':
12                    stack.append(cur_no)
13                elif prev_op=='-':
14                    stack.append(-cur_no)
15                elif prev_op=='*':
16                    stack.append(stack.pop()*cur_no)
17                elif prev_op=='/':
18                    stack.append(int(stack.pop()/cur_no))
19                prev_op=ch
20                cur_no=0
21        return sum(stack)