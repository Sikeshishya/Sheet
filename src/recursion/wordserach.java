package recursion;

public class wordserach {
    public boolean exist(char[][] board, String word) {

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col] == word.charAt(0)) {
                    boolean found = dfs(board, row, col, word, 0);
                    if (found == true) {
                        return true;
                    }
                }
            }
        }

        return false;

    }

    public  boolean dfs(char[][] board, int row, int col, String word, int index) {
        if (index == word.length()) {
            return true;
        }

        if (row < 0 || row > board.length || col < 0 || col > board[0].length) {
            return false;
        }

        if (board[row][col] == ' ' || board[row][col] != word.charAt(index)) {
            return false;
        }

        char ch = board[row][col];
        board[row][col] = ' ';

        if (dfs(board, row + 1, col, word, index + 1) ||
                dfs(board, row - 1, col, word, index + 1) ||
                dfs(board, row, col + 1, word, index + 1) ||
                dfs(board, row, col - 1, word, index + 1)) {
            return true;
        }
        board[row][col] = ch;

        return false;
    }

}
