1class Solution {
2    public int minimumOperations(int[] nums) {
3        int cnt=0;
4        for(int i:nums){
5            // cnt+=Math.min(i%3,3-(i%3));
6            if(i%3!=0) cnt++;
7        }
8        return cnt;
9    }
10}