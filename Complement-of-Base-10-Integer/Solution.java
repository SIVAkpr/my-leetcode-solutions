1class Solution {
2    public int bitwiseComplement(int n) {
3        if(n==0){
4            return 1;
5        }
6        int xor=0;
7        int temp=n;
8        while(temp>0){
9            xor=(xor<<1)|1;  //since 5 xor 7(b111) =2
10            temp>>=1;
11        }
12        return n^xor;
13    }
14}