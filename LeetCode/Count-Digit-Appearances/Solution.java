1class Solution {
2    public int countDigitOccurrences(int[] nums, int digit) {
3        int cnt=0;
4        for(int i:nums){
5            while(i>0){
6                int a=i%10;
7                if(a==digit)
8                    cnt+=1;
9                i=i/10;
10            }
11        }
12        return cnt;
13    }
14}