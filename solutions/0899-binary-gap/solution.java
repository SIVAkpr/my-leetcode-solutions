class Solution {
    public int binaryGap(int n) {
        if(n==1||n==0||n==2||n==4||n==8||n==16||n==32||n==64||n==128||n==256){
            return 0;
        }
        String x=dec2bin(n);
        System.out.println(x);
        int max_gap=0;
        int ct_gap=0;
        boolean foundFirstOne = false;
        for(char i: x.toCharArray()){
            if (i=='1'){
                if(foundFirstOne){
                    max_gap=Math.max(max_gap,ct_gap+1);
                }
                foundFirstOne=true;
                ct_gap=0;
            } 
            else if(foundFirstOne){
                ct_gap++;
            }
        }
        return max_gap;
    }
    public String dec2bin(int a){
        String ans="";
        while(a>0){
            if((a%2)==0){
                ans="0"+ans;
            }
            else{
                ans="1"+ans;
            }
            a=a/2;
        }
        return ans;
    }
}
