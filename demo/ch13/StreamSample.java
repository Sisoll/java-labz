package demo.ch13;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamSample {
    public static void main(String[] args) {
        // Step 1: 建立一個 List，內容為 1 ~ 10 的 int
        List<Integer> list = IntStream.rangeClosed(1, 10)
            .boxed()
            // Step 2: 將每個值 x 2 + 1
            .map(i -> i * 2 + 1)
            // Step 3: 保留是 3 的倍數
            .filter(i -> i % 3 == 0)
            // Step 4: 將每個值變平方
            .map(i -> i * i)
            .collect(Collectors.toList());

        // Note: add `-ea` to VM arguments
        assert list.size() == 4;
        assert list.equals(List.of(9, 81, 225, 441));
    }
}
