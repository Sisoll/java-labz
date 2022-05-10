package JavaLabs_exercise;

/**
 * <pre>
 7. 利用迴圈將字串"Hello, World, 大家好" 內的字元，一次取一個出來，與它所對應的整數值同時印在螢幕上： 
  H  72 
  e  101 
  l  108 
  l  108
 * </pre>
 * 
 * @author SisolShie
 *
 */
public class Q04_07 {

	public static void main(String[] args) {
		String s = "Hello, World, 大家好";
		for (var i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i) + "  " + (int) s.charAt(i));
		}

	}

}
