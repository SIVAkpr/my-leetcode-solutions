// Last updated: 3/21/2026, 3:40:32 PM
class Solution {
    public int countSegments(String s) {
        int cnt=0;
        if(s.isEmpty()){
            return 0;
        }
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)!=' ')&&(i==0 || s.charAt(i-1)==' ')){
                cnt++;
            }
        }
        return cnt;
    }
}