package RecusrionBacktracking;
import java.util.*;

public class fNQueens {

    public static void solve(int row,
                             char[][] board,
                             List<List<String>> result) {

        if (row == board.length) {

            List<String> temp = new ArrayList<>();

            for (char[] r : board) {
                temp.add(new String(r));
            }

            result.add(temp);
            return;
        }

        for (int col = 0; col < board.length; col++) {

            if (isSafe(board, row, col)) {

                board[row][col] = 'Q';

                solve(row + 1, board, result);

                board[row][col] = '.'; // Backtrack
            }
        }
    }

    public static boolean isSafe(char[][] board,
                                 int row,
                                 int col) {

        int r, c;

        // Upper Column
        r = row;
        while (r >= 0) {
            if (board[r][col] == 'Q')
                return false;
            r--;
        }

        // Upper Left Diagonal
        r = row;
        c = col;

        while (r >= 0 && c >= 0) {
            if (board[r][c] == 'Q')
                return false;
            r--;
            c--;
        }

        // Upper Right Diagonal
        r = row;
        c = col;

        while (r >= 0 && c < board.length) {
            if (board[r][c] == 'Q')
                return false;
            r--;
            c++;
        }

        return true;
    }

    public static void main(String[] args) {

        int n = 4;

        char[][] board = new char[n][n];

        for (char[] row : board) {
            Arrays.fill(row, '.');
        }

        List<List<String>> result = new ArrayList<>();

        solve(0, board, result);

        System.out.println(result);
    }
}