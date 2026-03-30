1class Solution {
2    public String intToRoman(int num) {
3        int[] val ={1000,900,500,400,100,90,50,40,10,9,5,4,1};
4        String[] sym={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
5        // StringBuilder rst= new StringBuilder();
6        String rst="";
7        for(int i=0;i<val.length;i++){
8            while(num>=val[i]){
9                num-=val[i];
10                // rst.append(sym[i]);
11                rst+=sym[i];
12            }
13        }
14        return rst;
15    }
16}