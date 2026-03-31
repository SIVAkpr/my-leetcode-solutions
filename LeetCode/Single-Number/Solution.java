1class Solution {
2    public int singleNumber(int[] nums) {
3        if(nums.length==1) return nums[0];
4        // Map<Integer,Integer> map=new Hashmap<>();
5        Map<Integer, Integer> map = new HashMap<>();
6        for(int i : nums){
7            map.put(i,map.getOrDefault(i,0)+1);
8        }
9        // System.out.println(map);
10        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
11            if (entry.getValue()==1){
12                return entry.getKey();
13            }
14        }
15        return -1;
16    }
17}