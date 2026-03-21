// Last updated: 3/21/2026, 3:39:59 PM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int[] c=candies;
        int max=0;
        for(int i: c ){
            max=Math.max(max,i);
        }
        List<Boolean> rst = new ArrayList<>();
        for(int i : c){
            boolean val=(i+extraCandies)>=max;
            rst.add(val);
        }
        return rst;
    }
}