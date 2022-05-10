package JavaLabs_exercise;

import java.util.Arrays;

/**
 * <pre>
 *  2. 撰寫一個程式，它能由1-42個數字中隨機產生六個數字，不允許重複的數字。 
 * @author SisolShie
 *</pre>
 */
public class Q05_02 {

	public static void main(String[] args) {
		
		int[] num = new int[5];
		redo:
		for (var i=0 ; i<num.length ; i++) {
			num[i] = (int)( Math.random()*42 + 1);
			for (var j=0 ; j<i ; j++) {
				if( num[i] == num[j]) {
					i--;
					continue redo;
				}
			}
		
		}
		System.out.println(Arrays.toString(num));
		

	}

}
