package unittestjava;

import org.junit.jupiter.api.Test;

import java.util.function.IntBinaryOperator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class AddOrMultTest {

    @Test
    void testAdd() {
        IntBinaryOperator add = mock(IntBinaryOperator.class);
        IntBinaryOperator mult = mock(IntBinaryOperator.class);
        when(add.applyAsInt(anyInt(), anyInt())).thenReturn(8);

        AddOrMult addOrMult = new AddOrMult(add, mult);
        int val = addOrMult.doOperation(2, 6, "add");

        assertEquals(8, val);
        verify(add).applyAsInt(2, 6);
    }

    @Test
    void testMult() {
        IntBinaryOperator add = mock(IntBinaryOperator.class);
        IntBinaryOperator mult = mock(IntBinaryOperator.class);
        when(mult.applyAsInt(anyInt(), anyInt())).thenReturn(12);

        AddOrMult addOrMult = new AddOrMult(add, mult);
        int val = addOrMult.doOperation(2, 6, "mult");

        assertEquals(12, val);
        verify(mult).applyAsInt(2, 6);
    }

    @Test
    void testInvalidOperationThrows() {
        AddOrMult addOrMult = new AddOrMult(Integer::sum, (a, b) -> a * b);

        assertThrows(IllegalArgumentException.class, () -> addOrMult.doOperation(2, 6, "div"));
    }
}
