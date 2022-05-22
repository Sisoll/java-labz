package JavaLabs_exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 
 * Q10_01. 請寫一程式Q10_01.java，它能讀入一檔案，然後於螢幕上顯示它有多少個位元組。
 * 
 * @author SisolShie
 *
 */
public class Q10_01 {

	public static void main(String[] args) {

		Q10_01("D://MyDaya.txt");
	}

	static void Q10_01(String src) {

		try (FileInputStream fis = new FileInputStream(src);) {
			System.out.println(fis.available());
		} catch (FileNotFoundException e) {
			System.out.println("no file");
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
