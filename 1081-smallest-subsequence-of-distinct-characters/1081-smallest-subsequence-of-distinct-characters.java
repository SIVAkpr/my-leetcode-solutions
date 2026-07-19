class Solution {
    public String smallestSubsequence(String s) {
        StringBuilder ans = new StringBuilder();
        boolean[] seen=new boolean[26];
        int[] cnt =new int[26];
        for(char c:s.toCharArray())
            cnt[c-'a']++;
        for(char i : s.toCharArray()){
            cnt[i-'a']--;
            if(seen[i-'a'])
                continue;
            
            while(ans.length()>0){
                char la=ans.charAt(ans.length()-1);
                if(la<=i || cnt[la-'a']==0)
                    break;
                seen[la-'a']=false;
                ans.deleteCharAt(ans.length()-1);
            }
            ans.append(i);
            seen[i-'a']=true;
            
        }
        return ans.toString();
    }
}