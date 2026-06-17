1class Solution {
2    public boolean isDigitorialPermutation(int n) {
3        int s=0;
4        int nn=n;
5        int[] arr={1,1,2,6,24,120,720,5040,40320,362880,3628800};
6        while(n>0){
7            int a=n%10;
8            // s+=fact(a);
9            s+=arr[a];
10            n=n/10;
11        }
12        if(check(nn,s)){
13            return true;
14        }
15        else{
16            return false;
17        }
18    }
19    public boolean check(int a,int b){
20        char[] a1=String.valueOf(a).toCharArray();
21        char[] b1=String.valueOf(b).toCharArray();
22        Arrays.sort(a1);
23        Arrays.sort(b1);
24        return Arrays.equals(a1,b1);
25
26    }
27    // public int fact(int num){
28    //     if(num==0|| num==1)
29    //         return 1;
30    //     else{
31    //         return num*fact(num-1);
32    //     }
33    // }
34}