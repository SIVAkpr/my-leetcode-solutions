class Solution {
    public int countDigits(int num) {
        int a=num;
        int count=0;
        while(num>0){
            int x=num%10;
            if((a%x)==0){
                count++;
            }
            num=num/10;
        }
        return count;
    }
}
