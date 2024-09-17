package IntList;

import static org.junit.Assert.*;
import org.junit.Test;

public class SquarePrimesTest {

    /**
     * Here is a test for isPrime method. Try running it.
     * It passes, but the starter code implementation of isPrime
     * is broken. Write your own JUnit Test to try to uncover the bug!
     */
    @Test
    public void testSquarePrimesSimple() {
        IntList lst = IntList.of(14, 15, 16, 17, 18);
        boolean changed = IntListExercises.squarePrimes(lst,false);
        assertEquals("14 -> 15 -> 16 -> 289 -> 18", lst.toString());
        assertTrue(changed);

        IntList lst2 = IntList.of(17,17,17,17);
        boolean changed2 = IntListExercises.squarePrimes(lst2,false);
        assertEquals("289 -> 289 -> 289 -> 289", lst2.toString());
        assertTrue(changed2);
    }
}
