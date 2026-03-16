package unittestjava;

public final class Compute {

    private Compute() {
    }

    public static int myadd(int a, int b) {
        if (a > 0 && b > 0) {
            return a + b;
        }

        if (a < 0 && b < 0) {
            return a + b;
        }

        if (a == 0) {
            return b;
        }

        if (b == 0) {
            return a;
        }

        if (a > 0 && b < 0) {
            if (Math.abs(a) > Math.abs(b)) {
                return a + b;
            }
            if (Math.abs(a) < Math.abs(b)) {
                return a + b;
            }
        }

        return 0;
    }

    public static int mymult(int a, int b) {
        if (a > 0 && b > 0) {
            return a * b;
        }

        if (a < 0 && b < 0) {
            return a * b;
        }

        if (a > 0 && b < 0) {
            return a * b;
        }

        if (a < 0 && b > 0) {
            return a * b;
        }

        if (a == 0) {
            return 0;
        }

        if (b == 0) {
            return 0;
        }

        return -100;
    }
}
