class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int counter = 0;
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    counter = Math.max(counter, dfsHelper(grid, i, j));
                }
            }
        }

        return counter;
    }

    public int dfsHelper(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length
        || grid[i][j] == 0) {
            return 0;
        }
        grid[i][j] = 0;

        return 1 + dfsHelper(grid, i + 1, j) + dfsHelper(grid, i - 1, j) + dfsHelper(grid, i, j - 1) + dfsHelper(grid, i, j + 1);
    }

}