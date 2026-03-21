// Last updated: 3/21/2026, 3:40:50 PM
class Solution {
    public boolean isPalindrome(String s) {
        int r=s.length()-1;
        int l=0;
        while(l<r){
            char q=s.charAt(l);
            char x=Character.toLowerCase(q);
            if(!Character.isLetterOrDigit(x)){
                l+=1;
                continue;
            }
            q=s.charAt(r);
            char y=Character.toLowerCase(q);
            if(!Character.isLetterOrDigit(y)){
                r-=1;
                continue;
            }
            System.out.println(x+" "+y);
            if(x!=y){
                System.out.println(x+" "+y);
                return false;
            }
            l+=1;
            r-=1;
        }
        return true;
    }
}