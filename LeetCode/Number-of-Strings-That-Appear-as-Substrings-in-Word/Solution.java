1class Solution {
2    public int numOfStrings(String[] patterns, String word) {
3        int ans=0;
4        for(String i: patterns){
5            if(word.contains(i))
6                ans++;
7        }
8        return ans;
9    }
10}