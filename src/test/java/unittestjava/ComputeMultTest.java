package unittestjava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ComputeMultTest {

    @Test
    void testMult() {
        int val = Compute.mymult(2, 6);
        assertEquals(12, val);
    }

    @Test
    void testMultPp() {
        int val = Compute.mymult(2, 6);
        assertTrue(val > 0);
    }

    @Test
    void testMultNn() {
        int val = Compute.mymult(-2, -6);
        assertTrue(val > 0);
    }

    @Test
    void testMultPn() {
        int val = Compute.mymult(2, -6);
        assertTrue(val < 0);
    }

    @Test
    void testMultNp() {
        int val = Compute.mymult(-2, 6);
        assertTrue(val < 0);
    }

    @Test
    void testMultA0() {
        int val = Compute.mymult(0, 6);
        assertEquals(0, val);
    }

    @Test
    void testMultB0() {
        int val = Compute.mymult(2, 0);
        assertEquals(0, val);
    }
}
