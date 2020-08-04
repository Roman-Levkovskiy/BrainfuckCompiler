package BrainfuckPac;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrevTest {
    Prev prev = new Prev();
    Array array = new Array();

    @Test
    public void test() {
        array.setPosition(3);

        prev.execute(array);
        assertEquals(2, array.getPosition());

        prev.execute(array);
        assertEquals(1, array.getPosition());

        prev.execute(array);
        assertEquals(0, array.getPosition());

        prev.execute(array);
        assertEquals(0, array.getPosition());
    }
}
