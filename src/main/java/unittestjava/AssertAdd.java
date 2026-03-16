package unittestjava;

public final class AssertAdd {

    private AssertAdd() {
    }

    public static void main(String[] args) {
        assert 3 == Compute.myadd(1, 2) : "1+2 is not 3";
        assert -2 == Compute.myadd(4, -6) : "4+(-6) is not -2";
    }
}
