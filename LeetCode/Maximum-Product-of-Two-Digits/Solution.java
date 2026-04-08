1class Solution {
2    public int maxProduct(int n) {
3        int max=0;
4        int a,b;
5        String str =String.valueOf(n);
6        for(int i=0;i<str.length();i++){
7            for(int j=i+1;j<str.length();j++){
8                a=str.charAt(i)-'0';
9                b=str.charAt(j)-'0';
10                max=Math.max(a*b,max);
11            }
12        }
13        return max;
14    }
15}