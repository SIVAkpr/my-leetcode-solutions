class Solution {
    public int missingInteger(int[] nums) {
        int s=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==(nums[i-1]+1)){
                s+=nums[i];
            }
            else{
                break;
            }
        }
        boolean seen[]=new boolean[51];
        for(int i : nums){
            seen[i]=true;
        }
        for(int i=s;;i++){
            if(i>=51 || !seen[i])
                return i;
        }
    }
}