package JavaLabs_exercise;

/**
 * <pre>
 * 將下列程式中Human類別的smile()改為抽象方法，然後看看還有哪些地方需要修改。 
 * class Human {
 * 		int weight = 50 ;
 * 		void smile() {
 * 			System.out.println("HA") ; 
 * 		} ; 
 * } 
 * class OrdinaryPeople extends Human { 
 * } 
 * class HappyMary extends OrdinaryPeople {
 * } 
 * public class Q07_03 {
 * 		public static void main(String args[]) {
 * 		HappyMary hm = new HappyMary() ;
 * 		hm.smile() ; 
 * 		} 
 * }
 * 
 * </pre>
 * @author SisolShie
 */
abstract class Human {
	int weight = 50;

	abstract void smile();
}

class OrdinaryPeople extends Human {

	@Override
	void smile() {
		System.out.println("需要override的方法");
	}
}

class HappyMary extends OrdinaryPeople {
}

public class Q07_03 {
	public static void main(String args[]) {
		HappyMary hm = new HappyMary();
		hm.smile();
	}
}
