class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int j=n;
            int prd=1;
            while(j>0){
                int a=j%10;
                prd=prd*a;
                j=j/10;
            }
            if(prd%t==0)
                return n;
            n++;
        }
        // throw new IllegalArgumentException();
    }
}