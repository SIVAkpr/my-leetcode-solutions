class Solution {
    public int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
    public int findGCD(int[] nums) {
        int mx=Integer.MIN_VALUE;
        int mn=Integer.MAX_VALUE;
        for(int i:nums){
            if(mx<i)
                mx=i;
            if(mn>i)
                mn=i;
        }
        return gcd(mn,mx);
    }
}