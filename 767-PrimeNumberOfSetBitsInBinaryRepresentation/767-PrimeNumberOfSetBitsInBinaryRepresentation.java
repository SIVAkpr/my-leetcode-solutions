// Last updated: 3/21/2026, 3:40:25 PM
class Solution {
    public int countPrimeSetBits(int left, int right) {
        Integer ans=0;
        for(int i=left;i<=right;i++){
            int c=0;
            String a=dec2bin(i);
            for(int j=0;j<a.length();j++){
                if(a.charAt(j)=='1'){
                    c++;
                }
            }
            if(c==2||c==3||c==5||c==7||c==11||c==13||c==17||c==19||c==23||c==27||c==31||c==37){
                ans++;
            }
        }
        return ans;      
    }
    public String dec2bin(int n){
        String a="";
        while(n>0){
            if((n%2)==0){
                a="0"+a;
            }
            else{
                a="1"+a;
            }
            n=n/2;
        }
        return a;
    }
}