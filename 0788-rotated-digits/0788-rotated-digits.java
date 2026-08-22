class Solution {
    public int rotatedDigits(int n) {
        int cnt=0;
        for(int i=1;i<=n;i++){
            if(goodnum(i))
                cnt++;
        }
        return cnt;
    }
    private int[] rotated=new int[] {0,1,5,-1,-1,2,9,-1,8,6};
    private boolean goodnum(int n){
        int r_num=0;
        int placevalue=1;
        int temp=n;
        while(temp>0){
            int dig=temp%10;
            if(rotated[dig]==-1)
                return false;
            r_num=rotated[dig]*placevalue+r_num;
            placevalue*=10;
            temp=temp/10;
        }
        return n!=r_num;
    }
}