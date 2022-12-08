import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("nothing yet");
    }

    public static int[][] addHints(int[][] input) {
        int[][] grid = new int[input.length][input[0].length];

        for (int y = 0; y < input.length; y++) {
            int[] row = input[y];
            for (int x = 0; x < row.length; x++)
                if (row[x] == -1) {
                    grid[y][x] = -1;
                    incrementNeighbors(grid, x, y);
                }
        }
        return grid;
    }

    public static void incrementNeighbors(int[][] grid, int x, int y) {
        if (y > 0) {
            if (x > 0) {
                if (grid[y - 1][x - 1] > -1) {
                    grid[y - 1][x - 1] += 1;
                }
            }
            if (grid[y - 1][x] > -1) {
                grid[y - 1][x] += 1;
            }
            if (x < grid.length - 1) {
                if (grid[y - 1][x + 1] > -1) {
                    grid[y - 1][x + 1] += 1;
                }
            }
            if (x > 0) {
                if (grid[y][x - 1] > -1) {
                    grid[y][x - 1] += 1;
                }
            }
            if (y < grid[0].length - 1) {
                if (grid[y + 1][x - 1] > -1) {
                    grid[y + 1][x - 1] += 1;
                }
            }
        }
        if (y < grid[0].length - 1) {
            if (grid[y + 1][x] > -1) {
                grid[y + 1][x] += 1;
            }
        }
        if (x < grid.length - 1) {
            if (grid[y][x + 1] > -1) {
                grid[y][x + 1] += 1;
            }
        }
        if (x < grid[0].length - 1 && y < grid.length - 1) {
            if (grid[y + 1][x + 1] > -1) {
                grid[y + 1][x + 1] += 1;
            }
        }
    }
}