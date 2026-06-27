1class Solution {
2    public int numberOfSpecialChars(String word) {
3        char[] lo=new char[26];
4        char[] up=new char[26];
5        for(char i : word.toCharArray()){
6            if(Character.isUpperCase(i))
7                up[i-'A']++;
8            else if(Character.isLowerCase(i))
9                lo[i-'a']++;
10        }
11        int res=0;
12        for(int i=0;i<26;i++){
13            if(lo[i]>0 && up[i]>0)
14                res++;
15        }
16        return res;
17    }
18}