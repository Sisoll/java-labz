package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 *
 *
 * <pre>
 * 1. 建立一個陣列，內容為 1 ~ 10 的 int
 * 2. 承上，請寫一個 for 迴圈將前一題陣列的每個值 x 2 + 1 存放至新的陣列
 * 3. * 承上，請寫一個 for 迴圈將陣列中，保留是 3 的倍數至新的陣列
 * 4. 承上，請寫一個 for 迴圈將前一題陣列的每個值的平方值存放至新的陣列
 * 5. * 承上，請寫一個 for 迴圈將陣列值相加總 6. 改用 functional programming 取代步驟 2~5
 * </pre>
 *
 * @author SisolShie
 */
public class StreamLambda01 {

  public static void main(String[] args) {

    int[] arr1 = new int[10];
    for (var i = 0; i < 10; i++) {
      arr1[i] = i + 1;
    }

    IntStream stream = Arrays.stream(arr1);
    int ans = stream.map(e -> e * 2 + 1).filter(e -> e % 3 == 0).map(e -> e * e).sum();
    System.out.println(ans);

    // ----------- 未使用LAMBDA形式 -----------
    // 2
    int[] arr2 = new int[arr1.length];
    for (var i = 0; i < arr2.length; i++) {
      arr2[i] = 2 * (i + 1) + 1;
    }

    // 3
    ArrayList<Integer> arr3List = new ArrayList<>();

    for (var i = 0; i < arr2.length; i++) {
      if (arr2[i] % 3 == 0) {
        arr3List.add(arr2[i]);
      }
    }

    int[] arr3 = new int[arr3List.size()];
    for (var j = 0; j < arr3List.size(); j++) {
      arr3[j] = arr3List.get(j);
    }

    // 4
    int[] arr4 = new int[arr3.length];
    for (var i = 0; i < arr4.length; i++) {
      arr4[i] = arr3[i] * arr3[i];
    }

    // 5
    int sum = 0;
    for (var i = 0; i < arr4.length; i++) {
      sum += arr4[i];
    }
  }

  static void printArray(int[] arr) {
    for (int value : arr) {
      System.out.print(value + " ");
    }
    // System.out.println();
  }
}
