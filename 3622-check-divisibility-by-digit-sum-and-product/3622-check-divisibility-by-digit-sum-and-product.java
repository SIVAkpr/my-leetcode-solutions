class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int prd=1;
        int ans=n;
        while(n!=0){
            int a=n%10;
            sum+=a;
            prd*=a;
            n/=10;
        }
        if(ans%(sum+prd)==0){
            return true;
        }
        return false;
    }
}