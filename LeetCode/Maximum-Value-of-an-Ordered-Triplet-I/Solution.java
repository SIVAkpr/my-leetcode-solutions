1class Solution {
2    public long maximumTripletValue(int[] nums) {
3        long max_i=0;//i
4        long max_diff=0;//i-j
5        long max_prd=0;//i-j*k
6        for(int i:nums){
7            max_prd=Math.max(max_prd,max_diff*i);
8            max_diff=Math.max(max_diff,max_i-i);
9            max_i=Math.max(max_i,(long)i);
10        }
11        // for(int i=0;i<nums.length-2;i++){
12        //     for(int j=i+1;j<nums.length-1;j++){
13        //         for(int k=j+1;k<nums.length;k++){
14        //             max=Math.max(max,nums[i]-nums[j]*nums[k]);
15        //         }
16        //     }
17        // }
18        return max_prd;
19    }
20}