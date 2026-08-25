class Solution {

    // DFS function
    private void dfs(int row, int col, char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        // Mark current cell as visited
        grid[row][col] = '0';

        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};

        for (int k = 0; k < 4; k++) {
            int newRow = row + delRow[k];
            int newCol = col + delCol[k];

            if (newRow >= 0 && newRow < n &&
                newCol >= 0 && newCol < m &&
                grid[newRow][newCol] == '1') {

                dfs(newRow, newCol, grid);
            }
        }
    }

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(i, j, grid);
                }
            }
        }
        return count;
    }
}