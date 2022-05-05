package JavaLabs_exercise;

/**
 * <pre>
 * 判斷執行順序
 * @author SisolShie
 *</pre>
 */
public class Q07_01 {

	{System.out.println("0");}
    static {    System.out.println("A"); /* 此處為靜態區塊(static code block) A  */ } 
    Q07_01 () { System.out.println("建構子"); /* 此處為建構子  */ } 
	{System.out.println("1");}

    static {     System.out.println("B");/* 此處為靜態區塊(static code block) B  */ } 
    public static void main(String args[]) { 
        Q07_01 con = new Q07_01 (); 
    	{System.out.println("1330");}

        System.out.print("HaHaHa") ; 
    	{System.out.println("444441330");}
    } 
    static { System.out.println("C");/* 此處為靜態區塊(static code block) C  */ } 
	{System.out.println("3");}

}




