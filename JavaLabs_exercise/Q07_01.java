package JavaLabs_exercise;

/**
 * <pre>
 * 判斷執行順序
 * @author SisolShie
 *</pre>
 */
public class Q07_01 {
	static int  a;

	{System.out.println("區塊1");}
	
    static {    System.out.println("靜態區塊A"); /* 此處為靜態區塊(static code block) A  */ } 
    
    Q07_01 () { System.out.println("建構子"); /* 此處為建構子  */ } 
    
	{System.out.println("區塊2");}

    static {     System.out.println("靜態區塊B");/* 此處為靜態區塊(static code block) B  */ } 
    
    public static void main(String args[]) { 
    	
    	System.out.println("main起點");
    		// Q07_01 con = new Q07_01 (); 
    	{System.out.println("main內的區塊");}

        System.out.print("main內的內容") ; 
        
    	{System.out.println("main內的區塊");}
    } 
    
    static { System.out.println("靜態區塊C");/* 此處為靜態區塊(static code block) C  */ } 
    
	{System.out.println("在main後面的區塊3");}
	
	static{ System.out.println("靜態區塊" + a);}
}




