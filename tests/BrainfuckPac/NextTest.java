package BrainfuckPac;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NextTest {
    Next next = new Next();
    Array array = new Array();
    @Test
    public void test() {
        array.setPosition(3);

        next.execute(array);
        assertEquals(4, array.getPosition());

        next.execute(array);
        assertEquals(5, array.getPosition());

        next.execute(array);
        assertEquals(6, array.getPosition());

        next.execute(array);
        assertEquals(7, array.getPosition());

    }
}
