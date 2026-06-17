1class Solution {
2    public boolean hasSameDigits(String s) {
3        while(s.length()>2){
4            StringBuilder x=new StringBuilder();
5            for(int i=0;i<s.length()-1;i++){
6                int a=s.charAt(i)-'0';
7                int b=s.charAt(i+1)-'0';
8                x.append((a+b)%10);
9            }
10            s=x.toString();
11        }
12        return s.charAt(0)==s.charAt(1);
13    }
14}