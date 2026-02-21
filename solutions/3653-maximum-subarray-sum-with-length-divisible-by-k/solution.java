class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        long max=Long.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     long c_sum=0;
        //     int l=0;
        //     for(int j=i;j<nums.length;j++){
        //         c_sum+=nums[j];
        //         l=l+1;
        //         if((l%k)==0){
        //             max=Math.max(max,c_sum);
        //         }
        //     }
        // }
        int n=nums.length;
        long prefix=0;
        long[] minPrefix=new long[k];
        for(int i=0;i<k;i++){
            minPrefix[i]=Long.MAX_VALUE;
        }
        minPrefix[0]=0;
        for(int i=0; i<n;i++){
            prefix+=nums[i];
            int mod=(i+1)%k;
            if(minPrefix[mod]!=Long.MAX_VALUE){
                max=Math.max(max,prefix-minPrefix[mod]);
            }
            minPrefix[mod]=Math.min(minPrefix[mod],prefix);
        }
        return max;
    }
}
