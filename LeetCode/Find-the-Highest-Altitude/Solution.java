1class Solution {
2    public int largestAltitude(int[] gain) {
3        int high=0;
4        int n=gain.length;
5        int s=0;
6        for(int i=0;i<n;i++){
7            s+=gain[i];
8            high=Math.max(s,high);
9        }
10        return high;
11    }
12}