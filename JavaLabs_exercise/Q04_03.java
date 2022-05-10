package JavaLabs_exercise;

/**
 * <pre>
 * 3.由程式算出1-10的連乘積。(請用for敘述來完成) 
 * 3A.由程式算出1-10的連乘積。(請用while敘述來完成)
 * </pre>
 * 
 * @author SisolShie
 *
 */
public class Q04_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var sumF = 1 ;
		for (var i=1 ; i<=10 ; i++) {
			sumF *=i;
		}
		
		var sumD = 1 ;
		int j = 1;
		while (j <=10) {
			sumD *= j ;
			j++;
		}
			
		System.out.println(sumF +" " + sumD);
		
	}

}
