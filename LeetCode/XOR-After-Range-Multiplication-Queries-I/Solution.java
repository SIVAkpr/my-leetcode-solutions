1class Solution {
2    public int xorAfterQueries(int[] nums, int[][] queries) {
3        long MOD = 1_000_000_007L;
4        int idx=0;
5        for(int[] i: queries){
6            idx=i[0];
7            int r=i[1];
8            int k=i[2];
9            int v=i[3];
10            while(idx<=r){
11                nums[idx]=(int)((1L*nums[idx]*v)%MOD);
12                idx+=k;
13            }
14        }
15        int ans=0;
16        for(int i: nums){
17            ans=ans^i;
18        }
19        return ans;
20    }
21}