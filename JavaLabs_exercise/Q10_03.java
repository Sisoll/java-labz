package JavaLabs_exercise;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * <pre>
 * Q10_03. 
 請寫一程式Q10_02.java，在程式內 
     (1) 請將浮點數17.625以DataOutputStream類別的writeDouble()將其寫至檔案上 
           C:\Data.txt。 
     (2) 關檔後，再以DataInputStream類別的readDouble() 讀回，顯示在銀幕上。 
     (提示：會用到類別有 FileOutputStream, DataOutputStream, FileInputStream, DataInputStream等類別)
 * </pre>
 * 
 * @author SisolShie
 *
 */
public class Q10_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String src = "file//Data.txt";

		try (FileOutputStream fos = new FileOutputStream(src); DataOutputStream dos = new DataOutputStream(fos)) {
			dos.writeDouble(17.625);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try (FileInputStream fis = new FileInputStream(src); DataInputStream dis = new DataInputStream(fis)) {
			System.out.println(dis.readDouble());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
