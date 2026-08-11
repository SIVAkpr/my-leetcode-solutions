class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[]=new int[nums1.length];
        for(int k=0;k<nums1.length;k++){
            int i=nums1[k];
            int idx=-1;
            boolean found=false;
            for(int j=0;j<nums2.length;j++){
                if(i==nums2[j]){
                    idx=j+1;
                    break;
                }
            }
            if(idx!=-1){
                while(idx<=nums2.length-1){
                    if(nums2[idx]>i){
                        ans[k]=nums2[idx];
                        found=true;
                        break;
                    }
                    idx++;
                }
            }
            if(!found)
                ans[k]=-1;
        }
        return ans;
    }
}