1class Solution {
2    public int getSum(int a, int b) {
3        int sum=a;
4        int cary=0;
5        if(a==0) return b;
6        while(b!=0){
7            sum=a^b;
8            cary=(a&b)<<1;
9            a=sum;
10            b=cary;
11        }
12        return sum;
13    }
14}