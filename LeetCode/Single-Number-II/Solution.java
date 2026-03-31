1class Solution {
2    public int singleNumber(int[] nums) {
3        if(nums.length==1) return nums[0];
4        Map<Integer, Integer> map = new HashMap<>();
5        for(int i : nums){
6            map.put(i,map.getOrDefault(i,0)+1);
7        }
8        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
9            if (entry.getValue()==1){
10                return entry.getKey();
11            }
12        }
13        return -1;
14    }
15}