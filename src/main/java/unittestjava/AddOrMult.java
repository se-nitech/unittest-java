package unittestjava;

import java.util.function.IntBinaryOperator;

public class AddOrMult {

    private final IntBinaryOperator add;
    private final IntBinaryOperator mult;

    public AddOrMult(IntBinaryOperator addFunc, IntBinaryOperator multFunc) {
        this.add = addFunc;
        this.mult = multFunc;
    }

    public int doOperation(int a, int b, String operation) {
        if ("add".equals(operation)) {
            return add.applyAsInt(a, b);
        }
        if ("mult".equals(operation)) {
            return mult.applyAsInt(a, b);
        }
        throw new IllegalArgumentException("Unsupported operation: " + operation);
    }
}
