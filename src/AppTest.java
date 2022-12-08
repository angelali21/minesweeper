import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class AppTest {
    @Test
    public void testAddHintsEmptyField() {
        int[][] output = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
        int[][] input = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
        assertArrayEquals(output, App.addHints(input));
    }

    @Test
    public void testAddHintsTwoMines() {
        int[][] output = { { -1, 1, 0, 0 }, { 2, 2, 1, 0 }, { 1, -1, 1, 0 }, { 1, 1, 1, 0 } };
        int[][] input = { { -1, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, -1, 0, 0 }, { 0, 0, 0, 0 } };
        assertArrayEquals(output, App.addHints(input));
    }

    @Test
    public void testAddHintsThreeMines() {
        int[][] input = { { 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0 },
                { 0, 0, -1, 0, 0 },
                { 0, 0, 0, 0, -1 },
                { -1, 0, 0, 0, 0 } };
        int[][] output = { { 0, 0, 0, 0, 0 },
                { 0, 1, 1, 1, 0 },
                { 0, 1, -1, 2, 1 },
                { 1, 2, 1, 2, -1 },
                { -1, 1, 0, 1, 1 } };
        assertArrayEquals(output, App.addHints(input));
    }
}
