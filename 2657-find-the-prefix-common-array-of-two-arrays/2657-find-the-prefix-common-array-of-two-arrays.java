class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int[] res=new int[n];
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            int cnt=0;
            res[A[i]%n]++;
            res[B[i]%n]++;
            for(int j: res)
                if(j>1)
                    cnt++;
            ans[i]=cnt;
        }
        return ans;
    }
}