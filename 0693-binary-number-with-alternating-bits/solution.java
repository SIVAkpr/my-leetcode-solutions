class Solution {
    public boolean hasAlternatingBits(int n) {
        boolean one=false;
        boolean zero=false;
        if((n%2)==0){
            one=true;
        }
        else{
            zero=true;
        }
        while(n>0){
            if(one){
                if((n%2)==0){
                    n=n/2;
                    zero=true;
                    one=false;
                }
                else{
                    return false;
                }
            }
            if(zero){
                if((n%2)==1){
                    n=n/2;
                    one=true;
                    zero=false;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}
