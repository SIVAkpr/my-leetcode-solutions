class Solution {
    public boolean hasAllCodes(String s, int k) {
        if(s.length()< Math.pow(2,k)){
            return false;
        }
        Set<String> myset = new HashSet<>();
        for(int i=0;i<s.length()-k+1;i++){
            myset.add(s.substring(i,i+k));
            if(myset.size()==Math.pow(2,k)){
                return true;
            }
        }
        return myset.size()==Math.pow(2,k);
    }
}
