class Solution {

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();

        char[][] board = new char[n][n];

        for(int i = 0; i < n; i++){
            Arrays.fill(board[i], '.');
        }

        solve(0, board, ans);

        return ans;
    }

    public void solve(int row, char[][] board, List<List<String>> ans){

        if(row == board.length){
            ans.add(construct(board));
            return;
        }

        for(int col = 0; col < board.length; col++){

            if(isSafe(board, row, col)){

                board[row][col] = 'Q';

                solve(row + 1, board, ans);

                board[row][col] = '.';
            }
        }
    }

    public boolean isSafe(char[][] board, int row, int col){

        int r = row;
        int c = col;

        while(r >= 0){
            if(board[r][c] == 'Q') return false;
            r--;
        }

        r = row;
        c = col;

        while(r >= 0 && c >= 0){
            if(board[r][c] == 'Q') return false;
            r--;
            c--;
        }

        r = row;
        c = col;

        while(r >= 0 && c < board.length){
            if(board[r][c] == 'Q') return false;
            r--;
            c++;
        }

        return true;
    }

    public List<String> construct(char[][] board){

        List<String> res = new ArrayList<>();

        for(int i = 0; i < board.length; i++){
            res.add(new String(board[i]));
        }

        return res;
    }
}