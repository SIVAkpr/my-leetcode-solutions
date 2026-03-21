// Last updated: 3/21/2026, 3:39:13 PM
class Solution {
    public boolean canAliceWin(int n) {
        if(n<10) return false;
        else if (n<=18) return true;
        int i=10;
        n=n-i;
        i--;
        while(n>=i){
            n=n-i;
            i--;
        }
        if(i%2!=0) return true;
        else return false;
    }
}