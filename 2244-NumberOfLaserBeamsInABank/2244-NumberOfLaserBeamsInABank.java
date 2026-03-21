// Last updated: 3/21/2026, 3:39:35 PM
class Solution {
    public int numberOfBeams(String[] bank) {
        int[] arr=new int[bank.length+2];
        int k=0;
        int a=0;
        for(String i:bank){
            int cnt=0;
            for(char j:i.toCharArray()){
                if(j=='1'){
                    cnt+=1;
                }
            }
            if(cnt!=0){
                arr[k++]=cnt;
                a=a+1;
            }
        }
        int mul=0;
        for(int i=1;i<a;i++){
            mul+=(arr[i]*arr[i-1]);
        }
        return mul;
    }
}