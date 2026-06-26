1class Solution {
2    public long countMajoritySubarrays(int[] nums, int target) {
3        long ans=0;
4        long presum=0;
5        int n=nums.length;
6        int[] pre=new int[(2*n)+1];
7        pre[n]=1;
8        int cnt=n;
9        for(int i=0;i<n;i++){
10            if(nums[i]==target){
11                presum+=pre[cnt];
12                cnt++;
13                pre[cnt]++;
14            }
15            else{
16                cnt--;
17                presum-=pre[cnt];
18                pre[cnt]++;
19            }
20            ans+=presum;
21        }
22        return ans;
23    }
24}