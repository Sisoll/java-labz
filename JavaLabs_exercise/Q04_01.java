package JavaLabs_exercise;

/**
 * 1.撰寫一個程式，它能由1-100個數字中隨機產生10個數字，並算出它們的總和與平均。(請用for敘述來完成)
 * 
 * @author SisolShie
 *
 */
public class Q04_01 {

	public static void main(String[] args) {

		double sum = 0;
		for (var i = 0; i < 10; i++) {
			var n = Math.random() * 100;
			sum += n;
		}

		System.out.println(sum);
		System.out.println(sum / 10);
	}
}
