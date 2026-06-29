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
/*
N-Queens Problem Statement
The N-Queens problem asks:
Place N Queens on an N × N chessboard such that no two queens attack each other.
How does a Queen move?
In chess, a Queen can attack in:
Same Row ← →
Same Column ↑ ↓
Diagonal ↖ ↗ ↘ ↙
So, while placing queens, we must ensure:
No two queens are in the same row.
No two queens are in the same column.
No two queens are on the same diagonal.
Example: 4 Queens on 4×4 Board
Board:
_ _ _ _
_ _ _ _
_ _ _ _
_ _ _ _

Place 4 queens (Q) such that none attack each other.
One valid arrangement:
_ Q _ _
_ _ _ Q
Q _ _ _
_ _ Q _

Check:
Every row has exactly one queen ✓
Every column has exactly one queen ✓
No queens share a diagonal ✓

Input: N = 4
Output: All possible valid arrangements of 4 queens. For N = 4, there are 2 valid solutions.
*/