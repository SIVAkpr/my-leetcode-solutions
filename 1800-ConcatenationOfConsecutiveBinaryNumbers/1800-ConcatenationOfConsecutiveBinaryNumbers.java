// Last updated: 3/21/2026, 3:39:49 PM
class Solution {
    public int concatenatedBinary(int n) {
        long mod=1000000007L;
        int len=0;
        long ans=0;
        for(int i=1;i<=n;i++){
            if((i&(i-1))==0){
                len++;
            }
            ans=((ans<<len)+i)%mod;
        }
        return (int)ans;
    }
}