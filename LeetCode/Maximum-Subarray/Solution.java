1class Solution {
2    public int maxSubArray(int[] nums) {
3        int max=nums[0];
4        int curr=nums[0];
5        for(int i=1;i<nums.length;i++){
6            curr=Math.max(nums[i],curr+nums[i]);
7            max=Math.max(curr,max);
8        }
9        return max;
10    }
11}