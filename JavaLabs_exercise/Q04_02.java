package JavaLabs_exercise;

/**
 * 2.請由程式算出1-1000的偶數和。(請用for敘述來完成)
 * 
 * @author SisolShie
 *
 */
public class Q04_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (var i = 0; i <= 1000; i++) {

			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);

	}

}
