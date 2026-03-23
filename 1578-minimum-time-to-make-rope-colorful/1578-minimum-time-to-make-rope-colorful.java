class Solution {
    public int minCost(String colors, int[] neededTime) {
        int[] n=neededTime;
        String c=colors;
        int ans=0;
        int maxtim=n[0];
        for(int i=1;i<n.length;i++){
            if(c.charAt(i)==(c.charAt(i-1))){
                ans+=Math.min(maxtim,n[i]);
                maxtim=Math.max(maxtim,n[i]);
            }
            else{
                maxtim=n[i];
            }
        }
        return ans;
    }
}