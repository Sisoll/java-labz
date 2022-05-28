package demo.ch13;

import java.util.Optional;

public class OptionalSample {
    public static void main(String[] args) {
        // Note: add `-ea` to VM arguments
        assert getType(null) == NumberType.UNKNOWN;
        assert getType("1") == NumberType.ODD;
        assert getType("2") == NumberType.EVEN;
        assert getType("a") == NumberType.UNKNOWN;
        assert getType(" 5 ") == NumberType.ODD;
    }

    static NumberType getType(String str) {
        return Optional.ofNullable(str)
            // 去掉字串頭尾空白
            .map(String::trim)
            // 把字串轉成 int
            .map(s -> {
                try {
                    return Integer.parseInt(s);
                } catch (NumberFormatException e) {
                    // 無法將字串轉為數字時，回傳 -1
                    return -1;
                }
            })
            // 過濾小於零數字
            .filter(i -> i > 0)
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
