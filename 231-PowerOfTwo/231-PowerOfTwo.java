// Last updated: 3/21/2026, 3:40:41 PM
import java.util.Arrays;
import java.util.List;
class Solution {
    public boolean isPowerOfTwo(int n) {
        Integer[] a={2,4,8};
        List<Integer> list=Arrays.asList(a);
        if(n==1){
            return true;
        }
        else if(n==2){
            return true;
        }
        while(n>1){
            if((n%2)!=0){
                return false;
            }
            n=n/2;
            if(list.contains(n)){
                return true;
            }            
            }
        return false;
        }
        
    }