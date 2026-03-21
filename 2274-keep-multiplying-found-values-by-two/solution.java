class Solution {
    public int findFinalValue(int[] nums, int original) {
        while(true){
            if(check(nums,original)){
                original*=2;
            }
            else{
                return original;
            }
        }
    }
    public boolean check(int[] a,int o){
        for(int i:a){
            if(i==o){
                return true;
            }
        }
        return false;
    }
}
