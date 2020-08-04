package BrainfuckPac;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlusTest {
    Array array = new Array();

    Plus plus = new Plus();

    @Test
    public void test(){
        array.array[0]=100;

        plus.execute(array);
        assertEquals(101, array.array[0]);

        plus.execute(array);
        assertEquals(102, array.array[0]);

        plus.execute(array);
        assertEquals(103, array.array[0]);

        plus.execute(array);
        assertEquals(104, array.array[0]);

        plus.execute(array);
        assertEquals(105, array.array[0]);

    }
}
