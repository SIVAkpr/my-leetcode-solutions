class Solution {
    public int maximumLengthSubstring(String s) {
        int ans=0;
        int n=s.length();
        int l=0;
        while(l<n){
            int r=n-1;
            int arr[]=new int[26];
            char c=s.charAt(l);
            arr[c-'a']++;
            for(int i=l+1;i<n;i++){
                c=s.charAt(i);
                arr[c-'a']+=1;
                if(arr[c-'a']>=3){
                    r=i-1;
                    break;
                }
            }
            ans=Math.max(ans,r-l+1);
            l++;
        }
        return ans;
    }
}