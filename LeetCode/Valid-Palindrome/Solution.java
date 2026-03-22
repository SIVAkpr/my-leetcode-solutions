1class Solution {
2    public boolean isPalindrome(String s) {
3        int r=s.length()-1;
4        int l=0;
5        while(l<r){
6            char q=s.charAt(l);
7            char x=Character.toLowerCase(q);
8            if(!Character.isLetterOrDigit(x)){
9                l+=1;
10                continue;
11            }
12            q=s.charAt(r);
13            char y=Character.toLowerCase(q);
14            if(!Character.isLetterOrDigit(y)){
15                r-=1;
16                continue;
17            }
18            System.out.println(x+" "+y);
19            if(x!=y){
20                System.out.println(x+" "+y);
21                return false;
22            }
23            l+=1;
24            r-=1;
25        }
26        return true;
27    }
28}