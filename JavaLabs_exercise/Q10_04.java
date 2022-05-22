package JavaLabs_exercise;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * <pre>
 * Q10_04. 
請寫一程式Q10_04.java， 
     (1)請將十個整數亂數(1 - 1000) 將其寫至檔案上C:\Data.txt，不過要以『附加模式
( Append)』寫出 ， 
     (2)以DataInputStream類別的readInt()讀回C:\Data.tx檔案內的整數亂數，然後顯示在銀幕 
          上。記得多測試幾次，觀察『附加模式』的效果。
 * </pre>
 * 
 * @author SisolShie
 *
 */
public class Q10_04 {

	public static void main(String[] args) {
		String src = "file//randomData.txt";

		try (FileOutputStream fos = new FileOutputStream(src, true); DataOutputStream dos = new DataOutputStream(fos)) {
			int i = 0;
			while (i < 10) {
				// System.out.println(i + " : " + (int) (Math.random() * 999 + 1));
				dos.writeInt((int) (Math.random() * 1000 + 1));
				i++;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try (FileInputStream fis = new FileInputStream(src); DataInputStream dis = new DataInputStream(fis)) {
			while (dis.read() != -1) {
				System.out.println(dis.readInt());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
