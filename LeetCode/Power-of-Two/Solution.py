1import java.util.Arrays;
2import java.util.List;
3class Solution {
4    public boolean isPowerOfTwo(int n) {
5        Integer[] a={2,4,8};
6        List<Integer> list=Arrays.asList(a);
7        if(n==1){
8            return true;
9        }
10        else if(n==2){
11            return true;
12        }
13        while(n>1){
14            if((n%2)!=0){
15                return false;
16            }
17            n=n/2;
18            if(list.contains(n)){
19                return true;
20            }            
21            }
22        return false;
23        }
24        
25    }