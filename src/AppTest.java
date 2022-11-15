import static org.junit.Assert.assertEquals;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.InputMap;

import org.junit.Test;

public class AppTest {
    @Test
    public void testAddHintsEmptyField() {
        assertEquals("0000\n0000\n0000\n0000", App.addHints("....\n....\n....\n...."));
    }

    @Test
    public void testAddHintsTwoMines() {
        assertEquals([[-1,1,0,0],[2,2,1,0],[1,-1,1,0],[1,1,1,0]], App.addHints("-1...\n....\n.-1..\n...."));
    }
}