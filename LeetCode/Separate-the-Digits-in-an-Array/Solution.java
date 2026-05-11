1class Solution {
2    public int[] separateDigits(int[] nums) {
3        String str="";
4        for(int i:nums){
5            str+=i;
6        }
7        int[] rst=new int[str.length()];
8        for(int i=0;i<str.length();i++){
9            rst[i]=Character.getNumericValue(str.charAt(i));
10        }
11        return rst;
12    }
13}