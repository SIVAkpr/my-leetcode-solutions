1class Solution {
2    public int[] bestTower(int[][] towers, int[] center, int radius) {
3        int[] unre={-1,-1};
4        int max=-1;
5        int[] rst=new int[2];
6        int l=towers.length;
7        int ck=l;
8        int[] max_i={0,0};
9        for(int[] i:towers){
10            int m=manhattan(Arrays.copyOfRange(i,0,2),center);
11            if(m<=radius){
12                l--;
13                if(max<i[2]){
14                    max=i[2];
15                    rst=new int[]{i[0],i[1]};
16                    // if(max==i[2]){
17                    //     rst=lexsmall(i,max_i);
18                    //     max_i=rst;
19                    // }
20                    // else rst=Arrays.copyOfRange(i,0,2);
21                    // max=i[2];
22                    // max_i=Arrays.copyOfRange(i,0,2);
23                }
24                else if(max==i[2]){
25                    if(i[0]<rst[0] || (i[0]==rst[0] && i[1]<rst[1])){
26                        rst=new int[]{i[0],i[1]};
27                    }
28                }
29            }
30
31        }
32        if(l==ck) return unre;
33        else return rst;
34    }
35    public int manhattan(int[] arr, int[] cen){
36        int rst=Math.abs(arr[0]-cen[0])+Math.abs(arr[1]-cen[1]);
37        return rst;
38    }
39    // public int[] lexsmall(int[] a,int[]b){
40    //     if(a[0]==b[0]){
41    //         if(a[1]<b[1]) return a;
42    //         else return b;
43    //     }
44    //     else{
45    //         if(a[0]<b[0]) return a;
46    //         else return b;
47    //     }
48    // }
49}