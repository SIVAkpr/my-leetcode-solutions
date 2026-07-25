// import java.util.function.IntPredicate;
class Solution {
    public int diagonalPrime(int[][] nums) {
        IntPredicate isprime =n ->{
            if(n<=1) return false;
            if(n<=3) return true;
            if(n%2==0 ||n%3==0) return false;
            for(int i=5;i*i<=n;i++){
                if(n%i==0) return false;
            }
            return true;
        };
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            if(max<nums[i][i] && isprime.test(nums[i][i]))
                max=Math.max(max,nums[i][i]);
            if(max<nums[i][n-i-1] && isprime.test(nums[i][n-i-1]))
                max=Math.max(max,nums[i][n-i-1]);
        }
        return max;
    }
}