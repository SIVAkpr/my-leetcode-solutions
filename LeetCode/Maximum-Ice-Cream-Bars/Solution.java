1class Solution {
2    public int maxIceCream(int[] costs, int coins) {
3        Arrays.sort(costs);
4        int cnt=0;
5        for(int i:costs){
6            if(i<=coins){
7                coins-=i;
8                cnt++;
9            }
10            else
11                break;
12        }
13        return cnt;
14    }
15}