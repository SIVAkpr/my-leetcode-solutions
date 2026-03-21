// Last updated: 3/21/2026, 3:39:27 PM
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] n = names;
        int[] h = heights;
        int l = n.length;
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < l; i++) {
            map.put(h[i], n[i]);
        }
        Arrays.sort(h);
        String[] ans = new String[l];
        for (int i = 0; i < l; i++) {
            ans[i] = map.get(h[l - i - 1]);
        }
        return ans;
    }
}