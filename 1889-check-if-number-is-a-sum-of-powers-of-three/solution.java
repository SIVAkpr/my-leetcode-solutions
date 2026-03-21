class Solution {
    public boolean checkPowersOfThree(int n) {
        while(n>0){
            if((n%3)>1){
                return false;
            }
            n=(int)n/3;
            System.out.println(n);
        }
        return true;
    }
}
