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
    public void whenWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] res = bishopBlack.way(Cell.G5);
        //Cell[] expected = {Cell.C1, Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Cell[] expected = {Cell.C1, Cell.C1, Cell.C1, Cell.C1};
        Assert.assertEquals(expected, res);
    }
}