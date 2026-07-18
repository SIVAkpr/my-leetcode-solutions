1class Solution {
2    private int gcd(int a,int b){
3        if(b==0)
4            return a;
5        return gcd(b,a%b);
6    }
7    public int findGCD(int[] nums) {
8        Arrays.sort(nums);
9        int min=nums[0];
10        int max=nums[nums.length-1];
11        return gcd(min,max);
12    }
13}