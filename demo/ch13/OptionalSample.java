package demo.ch13;

public class OptionalSample {
    public static void main(String[] args) {
        // Note: add `-ea` to VM arguments
        assert getType(null) == NumberType.UNKNOWN;
    }

    static NumberType getType(String str) {
        return NumberType.UNKNOWN;
    }

    enum NumberType {
        ODD,
        EVEN,
        UNKNOWN
    }
}
