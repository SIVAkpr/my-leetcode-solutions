1class Solution {
2    public boolean isPowerOfFour(int n) {
3        for(int i=0;i<n;i++){
4            long a=power(4,i);
5            if(a==n){
6                return true;
7            }
8            else if(a>n){
9                return false;
10            }
11        }
12        return false;
13    }
14    public long power(int x,int n){
15        if(n==0){
16            return 1;
17        }
18        else{
19            return x* power(x,n-1);
20        }
21    }
22}