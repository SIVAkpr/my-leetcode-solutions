1class Solution {
2    public int maxValue(int[] nums1, int[] nums0) {
3        // HashMap<Integer,String> map=new HashMap<>();
4        int n=nums1.length;
5        StringBuilder ans=new StringBuilder();
6        List<String> segs = new ArrayList<>();
7        for(int i=0;i<n;i++){
8            // ans.append("1".repeat(nums1[i]));
9            // ans.append("0".repeat(nums0[i]));
10            String s = "1".repeat(nums1[i]) + "0".repeat(nums0[i]);
11            segs.add(s);
12        }
13        segs.sort((a, b) -> (b + a).compareTo(a + b));
14        for (String s : segs) {
15            ans.append(s);
16        }
17        // for(int i=0;i<n;i++){
18        //     String a="";
19        //     a+="1".repeat(nums1[i]);
20        //     a+="0".repeat(nums0[i]);
21        //     map.put(nums1[i],a);
22        // }
23        // String ans="";
24        // for(String i: map.values()){
25        //     ans=i+ans;
26        // }
27        long rst=0;
28        long mod=1000000000+7;
29        for(int i=0;i<ans.length();i++){
30            rst=(rst*2 + (ans.charAt(i)-'0')) % mod;
31        }
32        // for(int i:index){
33        //     for(int j=0;j<nums1[i];j++)
34        //         rst=(rst*2+1)%mod;
35        //     for(int j=0;j<nums0[i];j++)
36        //         rst=(rst*2)%mod;
37        // }
38        return (int) rst;
39    }
40}