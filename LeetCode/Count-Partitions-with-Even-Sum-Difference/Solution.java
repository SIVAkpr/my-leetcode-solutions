1class Solution {
2    public int countPartitions(int[] nums) {
3        int ev=0;
4        long leftsum=0;
5        long tot=0;
6        for(int num:nums) tot+=num;
7        for(int i=0;i<nums.length-1;i++){
8            leftsum+=nums[i];
9            long rightsum=tot-leftsum;
10            // System.out.println(tot+" "+leftsum+" "+rightsum);
11            if((leftsum-rightsum)%2==0){
12                ev++;
13            }
14        }
15        return ev;
16    }
17}