1class Solution {
2    public List<Integer> powerfulIntegers(int x, int y, int bound) {
3        Set<Integer> rst=new HashSet<>();
4        for(int i=1;i<bound;i*=x){
5            for(int j=1;j+i<=bound;j*=y){
6                rst.add(i+j);
7                if(y==1){
8                    break;                    
9                }
10            }
11            if(x==1) break;
12        }
13        return new ArrayList<>(rst);
14    }
15}