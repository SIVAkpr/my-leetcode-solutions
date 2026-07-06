class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int cnt=1;
        int n=intervals.length;
        // for(int i=1;i<n;i++){
        //     if(intervals[i-1][0]>intervals[i][0] && intervals[i-1][1]<intervals[i][1]){
        //         cnt++;
        //     }
        // }
        Arrays.sort(intervals,(a,b)->{
            if(a[0]==b[0])
                return b[1]-a[1];
            return a[0]-b[0];
        });
        int prev=0; //index of last interval not covered
        for(int i=1;i<n;i++){
            if(intervals[i][1]<=intervals[prev][1])
                continue;
            else{
                cnt++;
                prev=i;
            }
        }
        return cnt;
    }
}