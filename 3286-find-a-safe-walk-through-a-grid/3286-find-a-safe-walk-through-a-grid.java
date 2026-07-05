class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int r=grid.size();
        int c=grid.get(0).size();
        int[][] mincost=new int[r][c];
        for(int[] row : mincost)
            Arrays.fill(row,Integer.MAX_VALUE);

        mincost[0][0]=grid.get(0).get(0);
        Deque<int[]> que=new ArrayDeque<>();
        que.offer(new int[] {0,0});

        final int[] dic={-1,0,1,0,-1}; //up right down left
        while(!que.isEmpty()){
            int[] currpos=que.pollFirst();
            int currR=currpos[0];
            int currC=currpos[1];
            if(currR == r-1 && currC==c-1)
                break;
                
            for(int i=0;i<4;i++){
                int nextrow=currR + dic[i];
                int nextcol=currC+dic[i+1];
                if(nextrow >=0 && nextrow<r && nextcol>=0 && nextcol < c){                    
                    int newcost=mincost[currR][currC]+grid.get(nextrow).get(nextcol);
                    if (mincost[nextrow][nextcol] > newcost) {
                        mincost[nextrow][nextcol] = newcost;

                        if (grid.get(nextrow).get(nextcol)==0) {
                            que.offerFirst(new int[] {nextrow,nextcol});
                        } else {
                            que.offerLast(new int[] {nextrow,nextcol});
                        }
                    }
                }
            }
        }
        return mincost[r-1][c-1]<health;
    }
}