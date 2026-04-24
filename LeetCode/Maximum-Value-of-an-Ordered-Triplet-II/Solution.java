1class Solution {
2    public long maximumTripletValue(int[] nums) {
3        long max_i=0;
4        long max_diff=0;
5        long max_prd=0;
6        for(int i: nums){
7            max_prd=Math.max(max_prd,max_diff*i);
8            max_diff=Math.max(max_diff,max_i-i);
9            max_i=Math.max(max_i,i);
10        }
11        return max_prd;
12    }
13}