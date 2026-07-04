class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long mas=mass;
        for(int i :asteroids){
            if(mas<i)
                return false;
            mas+=i;
        }
        return true;
    }
}