class Solution {
    private static int[][] DIRECTIONS = new int[][]{
        {-1, 0}, {1, 0},
        {0, -1}, {0, 1}
    };

    public int maxAreaOfIsland(int[][] grid) {

        if (grid.length == 0) {
            return 0;
        }

        int maxArea = 0;
        for (int r = 0; r < grid.length; ++r) {
            for (int c = 0; c < grid[0].length; ++c) {
                if (grid[r][c] > 0) {
                    int area = dfs(r, c, grid);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        return maxArea;
    }

    private int dfs(int r, int c, int[][] grid) {
        if (r < 0 || c < 0
            || r >= grid.length || c >= grid[0].length
            || grid[r][c] <= 0)
        {
            return 0;
        }

        int area = grid[r][c];
        grid[r][c] = 0;
        for (int[] dir : DIRECTIONS) {
            area += dfs(r + dir[0], c + dir[1], grid);
        }
        return area;
    }
}