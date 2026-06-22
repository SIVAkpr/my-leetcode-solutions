1class Solution {
2    public String removeStars(String s) {
3        StringBuilder stack =new StringBuilder();
4        for(char i: s.toCharArray()){
5            if(i=='*'){
6                stack.setLength(stack.length()-1);
7            }
8            else{
9                stack.append(i);
10            }
11        }
12        return stack.toString();
13    }
14}