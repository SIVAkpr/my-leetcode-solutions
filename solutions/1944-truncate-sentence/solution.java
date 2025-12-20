class Solution {
    public String truncateSentence(String s, int k) {
        String[] st=s.split(" ");
        String res="";
        String a=" ";
        for(int i=0;i<k;i++){
            if(i!=(k-1)){
                res+=st[i]+a;
            }
            else{
                res+=st[i];
            }
        }
        //System.out.println(st);
        return res;
    }
}
