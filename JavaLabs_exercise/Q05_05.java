package JavaLabs_exercise;

/**
 * <pre>
 * 二維陣列如下: 
     int[][]  test={  
                     { 10,  35,  40,  100,  90,  85,  75,   70}, 
                     { 37,  75,  77,   89,  64,  75,  70,   95}, 
                     {100,  70,  79,   90,  75,  70,  79,   90}, 
                     { 77,  95,  70,   89,  60,  75,  85,   89}, 
                     { 98,  70,  89,   90,  75,  90,  89,   90}, 
                     { 90,  80, 100,   75,  50,  20,  99,   75}}; 
     計算每一橫列的總和與每一直行的總和。
 * </pre>
 * 
 * @author SisolShie
 */
public class Q05_05 {

	public static void main(String[] args) {
		int[][] test = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };

		for (var i = 0; i < test.length; i++) {
			var sumR = 0;
			for (var j = 0; j < test[i].length; j++) {
				sumR += test[i][j];
			}
			System.out.println("第 " + (i + 1) + " 個橫列的總和是 " + sumR);
		}

		// 假設每一個陣列內的元素個數都相等
		for (var j = 0; j < 8; j++) {
			int sumC = 0;
			for (var i = 0; i < test.length; i++) {
				sumC += test[i][j];
			}
			System.out.println("第 " + (j + 1) + " 個直行的總和是 " + sumC);

		}

	}

}
