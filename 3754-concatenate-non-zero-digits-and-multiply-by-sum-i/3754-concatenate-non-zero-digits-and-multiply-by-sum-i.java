class Solution {
    public long sumAndMultiply(int n) {
        long x=0;
        long sum=0;
        int y=1;
        while(n>0){
            int a=n%10;
            if(a!=0){
                sum+=a;
                x+=(a*y);
                y=y*10;
            }
            n=n/10;
        }
        return x*sum;
    }
}