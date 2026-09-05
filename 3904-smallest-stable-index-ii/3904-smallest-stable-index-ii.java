class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int mx=Integer.MIN_VALUE;
        int idx;
        int[] mn=new int[n];
        mn[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            mn[i]=Math.min(nums[i],mn[i+1]);
        }
        for(int i=0;i<n;i++){
            mx=Math.max(nums[i],mx);
            idx=mx-mn[i];
            if(idx<=k)
                return i;
        }
        return -1;
    }
}