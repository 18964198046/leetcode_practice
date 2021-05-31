package practice.leecode.Bits;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsPowerOfFour_342Test {

    @Test
    public void isPowerOfFour_1() {
        IsPowerOfFour_342 isPowerOfFour_342 = new IsPowerOfFour_342();
        assertEquals(false, isPowerOfFour_342.isPowerOfFour(5));
        assertEquals(true, isPowerOfFour_342.isPowerOfFour(16));
    }

    @Test
    public void isPowerOfFour_2() {
        IsPowerOfFour_342 isPowerOfFour_342 = new IsPowerOfFour_342();
        assertEquals(false, isPowerOfFour_342.isPowerOfFour(0));
    }

}