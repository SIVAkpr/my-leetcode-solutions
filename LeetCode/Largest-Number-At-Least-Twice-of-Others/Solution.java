1class Solution {
2    public int dominantIndex(int[] nums) {
3        int larg=0;
4        int slarg=0;
5        int idx=0;
6        for(int i=0;i<nums.length;i++){
7            if(nums[i]>larg){
8                idx=i;
9                slarg=larg;
10                larg=nums[i];
11            }
12            else if(slarg<nums[i]){
13                slarg=nums[i];
14            }
15        }
16        if(2*slarg<=larg)
17            return idx;
18        else
19            return -1;
20    }
21}