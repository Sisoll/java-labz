package JavaLabs_exercise;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * <pre>
 *      請寫一程式Q10_05.java，請替這兩個類別各產生兩個物件，然後將它們(四個物件) 寫至 
 C:\data\Object.dat內。注意：它們有一個共有方法，public void smile()。 
     必須由程式判斷C:\data是否存在，如果C:\data不存在，請在程式內建立此資料夾。
 * </pre>
 * 
 * @author SisolShie
 *
 */
public class Q10_05 {

	public static void main(String[] args) {
		String dir = "C:\\javase\\workspace\\Pratice\\file";
		File file = new File(dir);
		String src = "\\Object.txt";
		if (!file.exists()) {
			System.out.println(file.mkdir());
		}

		Cat c1 = new Cat("cat1");
		Cat c2 = new Cat("cat2");
		Dog d1 = new Dog("dog1");
		Dog d2 = new Dog("Dog2");

		try (FileOutputStream fos = new FileOutputStream(dir + src);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(c1);
			oos.writeObject(c2);
			oos.writeObject(d1);
			oos.writeObject(d2);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
