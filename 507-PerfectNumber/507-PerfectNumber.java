// Last updated: 3/21/2026, 3:40:31 PM
class Solution {
    public boolean checkPerfectNumber(int num) {
        int pernum = 0;
        int x=num;
        for (int i = 1; i <= (x / 2); i++) {
            if ((x % i) == 0) {
                pernum += i;
            }
        }
        if (x == pernum) {
            return true;
        } else {
            return false;
        }
    }
}