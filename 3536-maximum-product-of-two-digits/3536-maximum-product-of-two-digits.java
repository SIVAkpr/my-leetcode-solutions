class Solution {
    public int maxProduct(int n) {
        int max=0;
        int a,b;
        String str =String.valueOf(n);
        for(int i=0;i<str.length();i++){
                a=str.charAt(i)-'0';
            for(int j=i+1;j<str.length();j++){
                b=str.charAt(j)-'0';
                max=Math.max(a*b,max);
            }
        }
        return max;
    }
}