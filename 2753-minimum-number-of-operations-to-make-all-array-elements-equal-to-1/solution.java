class Solution {
    public int minOperations(int[] nums) {
        int[] n=nums;
        int ones=0;
        for(int x:n){
            if(x==1){
                ones++;
            }
        }
        if(ones>0){
            return n.length-ones;
        }
        int minlen=Integer.MAX_VALUE;
        for(int i=0;i<n.length;i++){
            int g=n[i];
            for(int j=i+1;j<n.length;j++){
                g=gcd(g,n[j]);
                if(g==1){
                    minlen=Math.min(minlen,j-i+1);
                    break;
                }
            }
        }
        if(minlen==Integer.MAX_VALUE){
            return -1;
        }
        return (minlen-1)+(n.length-1);
        // int len=nums.length;
        // int right=nums.length-1;
        // int left=nums.length-2;
        // while (left>=0 && right>0){
        //     if((gcd(n[left],n[right]))!=1){
        //         return -1;
        //     }
        //     else{
        //         n[left]=1;
        //         l+=1;
        //         rst++;                
        //     }
        //     if(l==len){
        //         return rst;
        //     }
        //     left--;
        //     right--;
        //     if(left<0){
        //         right=nums.length-1;
        //         left=nums.length-2;
        //     }
        // }
    }
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}
