1class Solution {
2    public int maxNumberOfBalloons(String text) {
3        char[] b={'b','a','l','o','n'};
4        int[] l=new int[b.length];
5        for(char i: text.toCharArray()){
6            if(i=='b'){
7                l[0]+=1;
8            }
9            else if(i=='a'){
10                l[1]+=1;
11            }
12            else if(i=='l'){
13                l[2]+=1;
14            }
15            else if(i=='o'){
16                l[3]+=1;
17            }
18            else if(i=='n'){
19                l[4]+=1;
20            }
21        }
22        for(int i:l){
23            System.out.print(i+" ");
24        }
25        l[2]/=2;
26        l[3]/=2;
27        int a=Math.min( Math.min(l[0],l[1]) , Math.min(l[2],l[3]));
28        int c=Math.min(a,l[4]);
29        return c;
30        // if(l[0]==l[1] && l[1]==l[4] && l[2]==l[3] && l[3]==l[1]*2){
31        //     return l[0];
32        // }
33        // else{
34        //     int a=Math.min(Math.min(l[0],l[1]),l[4]);
35        //     int c=Math.min(l[2],l[3]);
36        //     if(a==0 || c<=1){
37        //         return 0;
38        //     }
39        //     else if(a*2<=c){
40        //         return a;
41        //     }
42        //     else{
43
44        //     }
45        // }
46    }
47}