package JavaLabs_exercise;

/**
 * <pre>
 5.撰寫一個程式. 利用 for 敘述於螢幕上印出下列訊息: 
      1   2   3   4   5   6   7   8   9   10 
      1   2   3   4   5   6   7   8   9    
      1   2   3   4   5   6   7   8    
      1   2   3   4   5   6   7    
      1   2   3   4   5   6    
      1   2   3   4   5    
      1   2   3   4    
      1   2   3    
      1   2    
      1
 * </pre>
 * 
 * @author SisolShie
 *
 */
public class Q04_05 {

	public static void main(String[] args) {
		for (var i = 10; i > 0; i--) {
			for (var j = 1; j <= i; j++) {
				System.out.print(j + "  ");
			}
			System.out.println();
		}

	}

}
