package RecusrionBacktracking;

import java.util.*;

public class gRatInMaze {

    static ArrayList<String> result = new ArrayList<>();

    public static ArrayList<String> findPath(int[][] maze, int n) {

        if (maze[0][0] == 0) return result;

        boolean[][] visited = new boolean[n][n];

        solve(0, 0, maze, n, visited, "");

        return result;
    }

    static void solve(int row, int col, int[][] maze, int n,
                      boolean[][] visited, String path) {

        // Destination reached
        if (row == n - 1 && col == n - 1) {
            result.add(path);
            return;
        }

        visited[row][col] = true;

        // Down
        if (isSafe(row + 1, col, maze, n, visited)) {
            solve(row + 1, col, maze, n, visited, path + "D");
        }

        // Left
        if (isSafe(row, col - 1, maze, n, visited)) {
            solve(row, col - 1, maze, n, visited, path + "L");
        }

        // Right
        if (isSafe(row, col + 1, maze, n, visited)) {
            solve(row, col + 1, maze, n, visited, path + "R");
        }

        // Up
        if (isSafe(row - 1, col, maze, n, visited)) {
            solve(row - 1, col, maze, n, visited, path + "U");
        }

        // Backtrack
        visited[row][col] = false;
    }

    static boolean isSafe(int row, int col, int[][] maze,
                          int n, boolean[][] visited) {

        return row >= 0 &&
               col >= 0 &&
               row < n &&
               col < n &&
               maze[row][col] == 1 &&
               !visited[row][col];
    }

    public static void main(String[] args) {

        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };

        System.out.println(findPath(maze, 4));
    }
}