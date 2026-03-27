class Solution {
    public int maximumValue(String[] strs) {
        int max=Integer.MIN_VALUE;
        for(String i: strs){
            if(i.matches(".*[a-zA-Z].*")){
                max=Math.max(max,i.length());
            }
            else{
                max=Math.max(max, Integer.parseInt(i));
            }
        }
        return max;
    }
}