import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(addHints("*...\n....\n..*.\n...."));
    }

    public static int[][] addHints(String input) {

        char c;
        // InputMap origin = new point(0, 0);
        // ArrayList<point> map = new ArrayList<point>();
        // while (reader.hasNext()) {
        // c = reader.next().charAt(0);
        // int current = map.get(map.size() - 1);
        // int next = new point(0, 0);
        // if (c == '*') {
        // next = new point(current.x + 1, current.y + 1);
        // }
        // if (c == ' ') {
        // next = new point(current.x + 0, current.y + 0);
        // }
        // char[] output;
        // System.out.println(output);
        int[][] grid = convertGrid(input);
        return grid;
    }

    public static int[][] convertGrid(String input) {
        int[][] grid = new int[4][4];
        int x = 0;
        int y = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '\n')
                continue;
            if (c == '*') {
                grid[x][y] = -1;
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
            if (grid[x - 1][y - 1] > -1) {
                grid[x - 1][y - 1] += 1;
            }
            if (grid[x - 1][y] > -1) {
                grid[x - 1][y] += 1;
            }
            if (y < 3) {
                if (grid[x - 1][y + 1] > -1) {
                    grid[x - 1][y + 1] += 1;
                }
            }
            if (grid[x][y - 1] > -1) {
                grid[x][y - 1] += 1;
            }
            if (x < 3) {
                if (grid[x + 1][y - 1] > -1) {
                    grid[x + 1][y - 1] += 1;
                }
            }
        }
        if (x < 3) {
            if (grid[x + 1][y] > -1) {
                grid[x + 1][y] += 1;
            }
        }
        if (y < 3) {
            if (grid[x][y + 1] > -1) {
                grid[x][y + 1] += 1;
            }
        }
        if (x < 3 && y < 3) {
            if (grid[x + 1][y + 1] > -1) {
                grid[x + 1][y + 1] += 1;
            }
        }
    }
}