class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int mx=Integer.MIN_VALUE;
        int stable_idx=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int mn=Integer.MAX_VALUE;
            mx=Math.max(mx,nums[i]);
            for(int j=i;j<n;j++){
                mn=Math.min(mn,nums[j]);
            }
            stable_idx=Math.min(stable_idx,mx-mn);
            if(stable_idx<=k)
                return i;
        }
        return -1;
    }
}