class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        if(n==3)
            return nums[0]*nums[1]*nums[2];
        Arrays.sort(nums);
        int prd=nums[n-1]*nums[n-2]*nums[n-3];
        int prd2=nums[0]*nums[1]*nums[n-1];
        return Math.max(prd,prd2);
    }
}