1class Solution {
2    public double angleClock(int hour, int minutes) {
3        double reqhr=((hour%12)*30)+(minutes*0.5);
4        double reqmin=minutes*(360/60);
5        // System.out.println(reqhr+" "+reqmin);
6        double ans=Math.abs(reqmin-reqhr);
7        return Math.min(ans,360-ans);
8    }
9}