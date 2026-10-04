class Solution {
    public boolean checkValidString(String s) {
        int open=0,close=0;
        int i;char c;
        for(i=0;i<s.length();i++){
            c=s.charAt(i);
            if(c=='(' || c=='*')
                open++;
            else
                open--;
            if(open<0)
                return false;
        }
        for(i=s.length()-1;i>=0;i--){
            c=s.charAt(i);
            if(c==')' || c=='*')
                close++;
            else
                close--;
            if(close<0)
                return false;
        }
        return true;
    }
}