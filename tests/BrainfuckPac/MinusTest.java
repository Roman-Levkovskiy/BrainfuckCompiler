package BrainfuckPac;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinusTest {
    Array array = new Array();

    Minus minus = new Minus();
    @Test
    public void test(){

        array.array[0]=100;

        minus.execute(array);
        assertEquals(99, array.array[0]);

        minus.execute(array);
        assertEquals(98, array.array[0]);

        minus.execute(array);
        assertEquals(97, array.array[0]);

        minus.execute(array);
        assertEquals(96, array.array[0]);

        minus.execute(array);
        assertEquals(95, array.array[0]);
    }
}
