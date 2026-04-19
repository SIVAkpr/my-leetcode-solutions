1class Solution {
2    public int minimumOperations(int[] nums) {
3        int cnt=0;
4        for(int i:nums){
5            cnt+=Math.min(i%3,3-(i%3));
6        }
7        return cnt;
8    }
9}