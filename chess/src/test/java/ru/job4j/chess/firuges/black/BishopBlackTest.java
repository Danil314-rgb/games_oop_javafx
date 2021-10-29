package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void whenPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.F8);
        Cell res = bishopBlack.position();
        assertThat(res, is(Cell.F8));
    }

    @Test
    public void whenCopy() {
        Figure fig = new BishopBlack(Cell.F8).copy(Cell.D6);
        assertThat(fig.position(), is(Cell.D6));
    }

    @Test
    public void whenWay1() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] res = bishopBlack.way(Cell.G5);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Assert.assertEquals(expected, res);
    }

    @Test
    public void whenWay2() {
        BishopBlack bishopBlack = new BishopBlack(Cell.G5);
        Cell[] res = bishopBlack.way(Cell.C1);
        Cell[] expected = {Cell.F4, Cell.E3, Cell.D2, Cell.C1};
        Assert.assertEquals(expected, res);
    }

    @Test
    public void whenWay3() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A3);
        Cell[] res = bishopBlack.way(Cell.C1);
        Cell[] expected = {Cell.B2, Cell.C1};
        Assert.assertEquals(expected, res);
    }

    @Test
    public void whenWay4() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] res = bishopBlack.way(Cell.A3);
        Cell[] expected = {Cell.B2, Cell.A3};
        Assert.assertEquals(expected, res);
    }

}