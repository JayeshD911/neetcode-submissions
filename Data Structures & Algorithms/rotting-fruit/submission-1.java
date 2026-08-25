class Solution {
    
    public int orangesRotting(int[][] grid) {
        
        int res = 0;

        Queue<int[]> q = new LinkedList<>();

        int row = grid.length;
        int col = grid[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
            }
        }

        while(!q.isEmpty()){
            int sz = q.size();
            for(int i=0;i<sz;i++){
                int x[] = q.poll();
                int r1 = x[0];
                int c1 = x[1];
                if(r1>0 && grid[r1-1][c1]==1){
                    grid[r1-1][c1]=2;
                    q.offer(new int[]{r1-1,c1});
                }

                if(r1<row-1 && grid[r1+1][c1]==1){
                    grid[r1+1][c1]=2;
                    q.offer(new int[]{r1+1,c1});
                }

                if(c1>0 && grid[r1][c1-1]==1){
                    grid[r1][c1-1]=2;
                    q.offer(new int[]{r1,c1-1});
                }

                if(c1<col-1 && grid[r1][c1+1]==1){
                     grid[r1][c1+1]=2;
                    q.offer(new int[]{r1,c1+1});
                }
            }

            if(!q.isEmpty()){
                res++;
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }

        return res;

    }       
}