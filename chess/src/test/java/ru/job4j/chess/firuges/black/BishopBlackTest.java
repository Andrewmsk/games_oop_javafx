package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void whenPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A2);
        assertEquals(bishopBlack.position(), Cell.A2);
    }

    @Test
    public void whenCopyThenSamePosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A2);
        assertEquals(bishopBlack.copy(Cell.A3).position(), Cell.A3);
    }

    @Test
    public void whenWayC1G5() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] cells = bishopBlack.way(Cell.G5);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertArrayEquals(cells, expected);
    }

    @Test
    public void whenWayD4H8() {
        BishopBlack bishopBlack = new BishopBlack(Cell.D4);
        Cell[] cells = bishopBlack.way(Cell.H8);
        Cell[] expected = {Cell.E5, Cell.F6, Cell.G7, Cell.H8};
        assertArrayEquals(cells, expected);
    }

    @Test
    public void whenWayD4A1() {
        BishopBlack bishopBlack = new BishopBlack(Cell.D4);
        Cell[] cells = bishopBlack.way(Cell.A1);
        Cell[] expected = {Cell.C3, Cell.B2, Cell.A1};
        assertArrayEquals(cells, expected);
    }

    @Test
    public void whenWayD4G1() {
        BishopBlack bishopBlack = new BishopBlack(Cell.D4);
        Cell[] cells = bishopBlack.way(Cell.G1);
        Cell[] expected = {Cell.E3, Cell.F2, Cell.G1};
        assertArrayEquals(cells, expected);
    }

    @Test
    public void whenWayD4A7() {
        BishopBlack bishopBlack = new BishopBlack(Cell.D4);
        Cell[] cells = bishopBlack.way(Cell.A7);
        Cell[] expected = {Cell.C5, Cell.B6, Cell.A7};
        assertArrayEquals(cells, expected);
    }

    @Test
    public void whenDiagonalC1A3ThenTrue() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertTrue(bishopBlack.isDiagonal(Cell.C1, Cell.A3));
    }

    @Test
    public void whenDiagonalC1G5ThenTrue() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertTrue(bishopBlack.isDiagonal(Cell.C1, Cell.G5));
    }

    @Test
    public void whenDiagonalC1H6ThenTrue() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertTrue(bishopBlack.isDiagonal(Cell.C1, Cell.H6));
    }

    @Test
    public void whenDiagonalE4B1ThenTrue() {
        BishopBlack bishopBlack = new BishopBlack(Cell.E4);
        assertTrue(bishopBlack.isDiagonal(Cell.E4, Cell.B1));
    }

    @Test
    public void whenDiagonalE4H1ThenTrue() {
        BishopBlack bishopBlack = new BishopBlack(Cell.E4);
        assertTrue(bishopBlack.isDiagonal(Cell.E4, Cell.H1));
    }

    @Test
    public void whenDiagonalC1G4ThenFalse() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertFalse(bishopBlack.isDiagonal(Cell.C1, Cell.G4));
    }

    @Test
    public void whenDiagonalC1C2ThenFalse() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertFalse(bishopBlack.isDiagonal(Cell.C1, Cell.C2));
    }
}