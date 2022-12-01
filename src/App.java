import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(addHints("*...\n....\n.*..\n...."));
    }

    public static int[][] addHints(String input) {
        int[][] grid = new int[4][4];
        int x = 0;
        int y = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '\n')
                continue;
            if (c == '*') {
                grid[y][x] = -1;
                incrementNeighbors(grid, x, y);
            }
            if (x < 3) {
                x = x + 1;
            } else {
                x = 0;
                y = y + 1;
            }
        }

        return grid;
    }

    public static void incrementNeighbors(int[][] grid, int x, int y) {
        if (x > 0 && y > 0) {
            if (grid[y - 1][x - 1] > -1) {
                grid[y - 1][x - 1] += 1;
            }
            if (grid[y - 1][x] > -1) {
                grid[y - 1][x] += 1;
            }
            if (y < 3) {
                if (grid[y - 1][x + 1] > -1) {
                    grid[y - 1][x + 1] += 1;
                }
            }
            if (grid[y][x - 1] > -1) {
                grid[y][x - 1] += 1;
            }
            if (x < 3) {
                if (grid[y + 1][x - 1] > -1) {
                    grid[y + 1][x - 1] += 1;
                }
            }
        }
        if (x < 3) {
            if (grid[y + 1][x] > -1) {
                grid[y + 1][x] += 1;
            }
        }
        if (y < 3) {
            if (grid[y][x + 1] > -1) {
                grid[y][x + 1] += 1;
            }
        }
        if (x < 3 && y < 3) {
            if (grid[y + 1][x + 1] > -1) {
                grid[y + 1][x + 1] += 1;
            }
        }
    }
}