class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashSet<String> usedwords =new HashSet<>();
        String[] a=new String[26];
        String[] b=s.split(" ");
        int j=0;
        if(pattern.length()!=b.length)
            return false;
        for(char i : pattern.toCharArray()){
            if(a[i-'a']!=null){
                if(!a[i-'a'].equals(b[j])){
                    return false;
                }
            }
            else{
                if(usedwords.contains(b[j]))
                    return false;
                a[i-'a']=b[j];
                usedwords.add(b[j]);
            }
            j++;
        }
        return true;
    }
}