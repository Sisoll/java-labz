package JavaLabs_exercise;

/**
 * <pre>
 * 
 *  4. 假設字串陣列如下: 
     String[] ca = {"snoopy","micky","lucky", "kitty","derby"}; 
     請計算此陣列中，母音字母(a,e,i,o,u)總共有多少個。
 * </pre>
 * 
 * @author SisolShie
 *
 */
public class Q05_04 {
	public static void main(String[] args) {

		String[] ca = { "snoopy", "micky", "lucky", "kitty", "derby" };

		String s = "";
		for (String value : ca) {
			s += value;
		}

		var numA = 0;
		var numE = 0;
		var numI = 0;
		var numO = 0;
		var numU = 0;

		for (var i = 0; i < s.length(); i++) {

			switch (s.charAt(i)) {
			case 'a':
				numA++;
				break;
			case 'e':
				numE++;
				break;
			case 'i':
				numI++;
				break;
			case 'o':
				numO++;
				break;
			case 'u':
				numU++;
				break;
			default:
				break;
			}

		}
		System.out.println("a : " + numA);
		System.out.println("e : " + numE);
		System.out.println("i : " + numI);
		System.out.println("o : " + numO);
		System.out.println("u : " + numU);
	}
}
