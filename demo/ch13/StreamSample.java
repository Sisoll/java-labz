package demo.ch13;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamSample {
    public static void main(String[] args) {
        // Step 1: 建立一個 List，內容為 1 ~ 10 的 int
        List<Integer> list = IntStream.rangeClosed(1, 10)
            .boxed()
            .collect(Collectors.toList());

        // Note: add `-ea` to VM arguments
        assert list.size() == 10;
        assert list.equals(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }
}
