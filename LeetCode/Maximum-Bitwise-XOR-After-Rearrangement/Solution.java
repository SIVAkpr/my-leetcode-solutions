1class Solution {
2    public String maximumXor(String s, String t) {
3        int n=s.length();
4        int x;
5        int[] cnt={0,0};
6        char[] ans=new char[n];
7        for(char i: t.toCharArray()){
8            cnt[i-'0']+=1;
9        }
10        for(int i=0;i<n;i++){
11            x=s.charAt(i)-'0';
12            if(cnt[x^1]>0){
13                cnt[x^1]-=1;
14                ans[i]='1';
15            }
16            else{
17                cnt[x]-=1;
18                ans[i]='0';
19            }
20        }
21        return new String(ans);
22    }
23}