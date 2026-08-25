class Solution {
    public void dfs(int i , int j , char[][] grid ){
        if(i<0 || j<0 || i >= grid.length || j >= grid[0].length || grid[i][j] =='0' || grid[i][j] =='#' ) return;
        grid[i][j] = '#'; //mark visited
        dfs(i+1,j,grid);
        dfs(i,j+1,grid);
        dfs(i-1,j,grid);
        dfs(i,j-1,grid);

    }
    public int numIslands(char[][] grid) {
        int ans = 0;
        int n = grid.length;
        int m = grid[0].length;
        for(int i = 0; i< n; i++){
            for(int j = 0; j< m; j++){
                if (grid[i][j] == '1'){
                    ans++;
                    dfs(i,j,grid);
                }
            }
        }
        return ans;
    }
}