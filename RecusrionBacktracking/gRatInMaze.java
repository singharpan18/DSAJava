package RecusrionBacktracking;

import java.util.*;

public class gRatInMaze {

    static ArrayList<String> solve(ArrayList<String> result,
                                   int row,
                                   int col,
                                   int[][] maze,
                                   int n,
                                   boolean[][] visited,
                                   String path) {

        // Destination reached
        if (row == n - 1 && col == n - 1) {
            result.add(path);
            return result;
        }

        visited[row][col] = true;

        // Down
        if (isSafe(row + 1, col, maze, n, visited)) {
            solve(result, row + 1, col, maze, n, visited, path + "D");
        }

        // Left
        if (isSafe(row, col - 1, maze, n, visited)) {
            solve(result, row, col - 1, maze, n, visited, path + "L");
        }

        // Right
        if (isSafe(row, col + 1, maze, n, visited)) {
            solve(result, row, col + 1, maze, n, visited, path + "R");
        }

        // Up
        if (isSafe(row - 1, col, maze, n, visited)) {
            solve(result, row - 1, col, maze, n, visited, path + "U");
        }

        // Backtrack
        visited[row][col] = false;

        return result;
    }

    static boolean isSafe(int row,
                          int col,
                          int[][] maze,
                          int n,
                          boolean[][] visited) {

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

        int n = maze.length;

        ArrayList<String> result = new ArrayList<>();

        if (maze[0][0] == 1) {
            boolean[][] visited = new boolean[n][n];

            solve(result,
                    0,
                    0,
                    maze,
                    n,
                    visited,
                    "");
        }

        System.out.println(result);
    }
}