class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        // List<Integer> lst=new ArrayList<>();
        int[] ans=new int[2];
        int q=0;
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        // System.out.println(map);
        for(int i: map.keySet()){
            if(map.get(i)>=2){
                ans[q++]=i;
            }
            // System.out.println(lst);
        }
        return ans;
    }
}