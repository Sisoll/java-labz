package JavaLabs_exercise;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Q10_06. 承前一題，請寫一程式Q10_06.java，由 C:\data\Object.dat 內讀取前一題所寫入的
 * 四個物件，然後執行它們的smile()，請用多型來簡化程式的設計。(也就是說，你要設計一個父類
 * 別，如Mammal，在其內定義共有方法，然後依照講義所列的步驟來撰寫)。
 * 
 * @mark{ 讀入多個物件用while(ture)迴圈}
 * 
 * @author SisolShie
 *
 */
public class Q10_06 {

	public static void main(String[] args) {

		String src = "C:\\javase\\workspace\\Pratice\\file\\Object.txt";

		try (FileInputStream fis = new FileInputStream(src); ObjectInputStream ois = new ObjectInputStream(fis)) {
			while (true) {
				((Mammal) ois.readObject()).smile();
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
