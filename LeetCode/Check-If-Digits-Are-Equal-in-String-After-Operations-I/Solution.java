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
12        // String rev=new StringBuilder(s).reverse().toString();
13        return s.charAt(0)==s.charAt(1);
14    }
15    public String check(String x){
16        String ans="";
17        for(int i=0;i<x.length()-1;i++){
18            int a=x.charAt(i)-'0';
19            int b=x.charAt(i+1)-'0';
20            ans+=((a+b)%10);
21        }
22        return ans;
23    }
24}