package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import ru.job4j.chess.firuges.Cell;
import static org.junit.Assert.assertThat;

public class BishopBlackTest extends TestCase {

    public void testPosition() {
        BishopBlack testPos = new BishopBlack(Cell.F8);
        Cell expected = Cell.F8;
        assertEquals (expected, testPos.position());

    }

    public void testCopy() {
        BishopBlack testCop = new BishopBlack(Cell.F8);
        Cell expected = Cell.F2;
        assertEquals(expected, testCop.copy(Cell.F2).position());

    }
}