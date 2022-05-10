package JavaLabs_exercise;

/**
 * <pre>
1. 一維陣列如下: 
      {84.0, 94, 79.9, 90.5, 82.4, 65.7, 72.8, 99.0, 85.2, 100 }  
     印出將該陣列所有元素的平均數與大於平均數的所有元素。
 * </pre>
 * 
 * @author SisolShie
 *
 */
public class Q05_01 {

	public static void main(String[] args) {
		double[] arr = { 84.0, 94, 79.9, 90.5, 82.4, 65.7, 72.8, 99.0, 85.2, 100 };
		double sum = 0;
		String aboveAvg = "";
		for (double value : arr) {
			sum += value;
		}

		double avg = sum / arr.length;

		for (double value : arr) {
			if (value > avg) {
				aboveAvg += value + "  ";
			}

		}

		System.out.println("平均: " + avg + " 大於平均的有:" + aboveAvg);
	}

}
