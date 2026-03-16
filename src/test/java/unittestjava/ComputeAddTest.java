package unittestjava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ComputeAddTest {

    @Test
    void testAdd() {
        int val = Compute.myadd(1, 2);
        assertEquals(3, val);
    }

    @Test
    void testAddPp() {
        int val = Compute.myadd(2, 6);
        assertTrue(val > 0);
    }

    @Test
    void testAddNn() {
        int val = Compute.myadd(-2, -6);
        assertTrue(val < 0);
    }

    @Test
    void testAddA0() {
        int val = Compute.myadd(0, 6);
        assertEquals(6, val);
    }

    @Test
    void testAddB0() {
        int val = Compute.myadd(2, 0);
        assertEquals(2, val);
    }

    @Test
    void testAddPnAGreaterThanB() {
        int val = Compute.myadd(4, -1);
        assertTrue(val > 0);
    }

    @Test
    void testAddPnALessThanB() {
        int val = Compute.myadd(1, -4);
        assertTrue(val < 0);
    }
}
