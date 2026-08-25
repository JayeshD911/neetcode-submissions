class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(grid[i][j] == '1'){
                    count++;
                    dfs(i, j, grid);
                }
            }
        }
        return count;
    }

    private void dfs(int r, int c, char[][] grid){
        if(r < 0 || c < 0 || r >= grid.length || c >= grid[0].length ||
        grid[r][c] == '0' || grid[r][c] == '#'){
            return;
        }

        grid[r][c] = '#';
        dfs(r+1, c, grid);
        dfs(r-1, c, grid);
        dfs(r, c+1, grid);
        dfs(r, c-1, grid);
    }
}