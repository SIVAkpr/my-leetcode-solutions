// Last updated: 3/21/2026, 3:40:16 PM
class Solution {
    public int bitwiseComplement(int n) {
        if(n==0){
            return 1;
        }
        int xor=0;
        int temp=n;
        while(temp>0){
            xor=(xor<<1)|1;  //since 5 xor 7(b111) =2
            temp>>=1;
        }
        return n^xor;
    }
}