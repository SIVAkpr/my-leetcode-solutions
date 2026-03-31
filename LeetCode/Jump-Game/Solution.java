1class Solution {
2    public boolean canJump(int[] nums) {
3        int max_rea=0;
4        for(int i=0;i<nums.length;i++){
5            if(max_rea<i) return false;
6            max_rea=Math.max(max_rea,i+nums[i]);
7        }
8        return true;
9    }
10}