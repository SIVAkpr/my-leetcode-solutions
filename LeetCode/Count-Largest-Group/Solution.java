1class Solution {
2    public int countLargestGroup(int n) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        int max_size=0;
5        int cnt=0;
6        for(int i=1;i<=n;i++){
7            int dig=0;
8            int a=i;
9            while(a>0){
10                dig+=(a%10);
11                a/=10;
12            }
13            map.put(dig,map.getOrDefault(dig,0)+1);
14            if(map.get(dig)>max_size){
15                max_size=map.get(dig);
16            }
17        }
18        for(int i: map.keySet()){
19            if(map.get(i)==max_size)
20                cnt++;
21        }
22        return cnt;
23    }
24}