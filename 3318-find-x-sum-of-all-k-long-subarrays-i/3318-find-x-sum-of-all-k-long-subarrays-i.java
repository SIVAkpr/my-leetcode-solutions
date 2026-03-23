class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int[] ans=new int[nums.length-k+1];
        for(int i=0;i<=nums.length-k;i++){
            int[] subarr=Arrays.copyOfRange(nums,i,i+k);
            ans[i]=xsum(subarr,x,k);
        }
        return ans;
    }
    public int xsum(int[] arr,int c,int k){
        int rst=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i: arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        Integer[] keys = map.keySet().toArray(new Integer[0]);
        Arrays.sort(keys, (a, b) -> {
            if (!map.get(a).equals(map.get(b)))
                return map.get(b) - map.get(a);
            return b - a;
        });
        for (int i=0;i<Math.min(c,keys.length);i++) {
            rst+=keys[i]*map.get(keys[i]);
        }
        return rst;
        // int v=0;
        // for(int i: map.keySet()){
        //     int g=map.get(i);
        //     if(g>=c){
        //         v=v+1;
        //         rst+=(i*g);
        //     }
        //     ans+=1;
        // }
        // Arrays.sort(arr);
        // if(c==1 || ((c==k) && (v<c))){
        //     return max*map.get(max);
        // }
        // if(v==c-1){
        //     rst+=max;
        //     // for(int i=arr.length-1;i>=(c-v);i--){
        //     //     rst+=arr[i];
        //     // }
        // }
        // else if(v<c){
        //     for(int i=c-1;i>=0;i--){
        //         rst+=arr[i];
        //     }
        // }
        // return rst;
    }
}