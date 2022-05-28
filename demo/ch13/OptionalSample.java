package demo.ch13;

import java.util.Optional;

public class OptionalSample {
    public static void main(String[] args) {
        // Note: add `-ea` to VM arguments
        assert getType(null) == NumberType.UNKNOWN;
        assert getType("1") == NumberType.ODD;
        assert getType("2") == NumberType.EVEN;
    }

    static NumberType getType(String str) {
        return Optional.ofNullable(str)
            // 把字串轉成 int
            .map(s -> Integer.parseInt(s))
            .map(i -> {
                // 檢查是奇數 / 偶數
                if (i % 2 == 0) {
                    return NumberType.EVEN;
                }
                return NumberType.ODD;
            })
            .orElse(NumberType.UNKNOWN);
    }

    enum NumberType {
        ODD,
        EVEN,
        UNKNOWN
    }
}
