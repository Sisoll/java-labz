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
            .collect(Collectors.toList());

        // Note: add `-ea` to VM arguments
        assert list.size() == 10;
        assert list.equals(List.of(3, 5, 7, 9, 11, 13, 15, 17, 19, 21));
    }
}
