class Solution {
    public int minElement(int[] nums) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int x=min(nums[i]);
            if(ans>x)
                ans=x;
        }
        return ans;
    }
    private int min(int a){
        int s=0;
        while(a>0){
            int q=a%10;
            s+=q;
            a=a/10;
        }
        return s;
    }
}