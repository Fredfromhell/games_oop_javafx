package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import ru.job4j.chess.firuges.Cell;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class BishopBlackTest {

    @Test
    public void testPosition() {
        BishopBlack testPos = new BishopBlack(Cell.F8);
        Cell expected = Cell.F8;
        assertEquals(expected, testPos.position());

    }

    @Test
    public void testCopy() {
        BishopBlack testCop = new BishopBlack(Cell.F8);
        Cell expected = Cell.F2;
        assertEquals(expected, testCop.copy(Cell.F2).position());

    }

    @Test
    public void testWay() {
        BishopBlack test = new BishopBlack(Cell.C1);
        Cell[] expected = new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertEquals(expected, test.way(Cell.G5));
    }
}