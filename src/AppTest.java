import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class AppTest {
    @Test
    public void testAddHintsEmptyField() {
        int[][] output = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
        assertArrayEquals(output, App.addHints("....\n....\n....\n...."));
    }

    @Test
    public void testAddHintsTwoMines() {
        int[][] output = {{-1,1,0,0},{2,2,1,0},{1,-1,1,0},{1,1,1,0}};
        assertArrayEquals(output, App.addHints("*...\n....\n.*..\n...."));
    }
}