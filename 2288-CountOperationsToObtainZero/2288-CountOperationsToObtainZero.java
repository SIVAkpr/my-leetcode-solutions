// Last updated: 3/21/2026, 3:39:33 PM
class Solution {
    public int countOperations(int num1, int num2) {
        int ans=0;
        if(num1==0||num2==0){
            return 0;
        }
        while(true){
            if(num1<num2){
                num2-=num1;
                ans++;
            }
            else if(num1>num2){
                num1-=num2;
                ans++;
            }
            else if(num1==num2){
                num1-=num2;
                ans++;
            }
            if(num1==0||num2==0){
                break;
            }
        }
        return ans;
    }
}