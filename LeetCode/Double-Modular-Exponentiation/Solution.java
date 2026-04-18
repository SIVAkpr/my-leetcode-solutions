1class Solution {
2    public List<Integer> getGoodIndices(int[][] variables, int target) {
3        List<Integer> lst=new ArrayList<>();
4        int idx=0;
5        for(int[] i: variables){
6            int a=i[0];
7            int b=i[1];
8            int c=i[2];
9            int m=i[3];
10            // int ans=poww(poww(a,b)%10,c)%m;
11            long ans=poww(poww(a,b,10),c,m);
12            if(ans==target){
13                lst.add(idx);
14            }
15            idx++;
16        }
17        return lst;
18    }
19    public long poww(long base, long exp, long mod) {
20        long res = 1;
21        base %= mod;
22        while (exp > 0) {
23            if (exp % 2 == 1) res = (res * base) % mod;
24            base = (base * base) % mod;
25            exp /= 2;
26        }
27        return res;
28    }
29    // public long pow(int a,int b){
30    //     if (b==0){
31    //         return 1;
32    //     }
33    //     else{
34    //         return a*pow(a,b-1);
35    //     }
36    // }
37}