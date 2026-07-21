class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int l=0;
        int r=nums.length-1;
        int num=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]<=nums[n-1]){
                num=mid;
                r=mid-1;
            }
            else{
                l=mid+1;                
            }
        }
        return nums[num];
    }
}