1class Solution {
2    public int[] divisibilityArray(String word, int m) {
3        int[] rst=new int[word.length()];
4        long curr=0;
5        for(int i=0;i<word.length();i++){
6            // long a=Long.parseLong(word.substring(0,i+1));
7            int a=word.charAt(i)-'0';
8            curr=(curr*10+a)%m;
9            if(curr==0){
10                rst[i]=1;
11            }
12            else{
13                rst[i]=0;
14            }
15        }
16        return rst;
17    }
18}