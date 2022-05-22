package JavaLabs_exercise;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �s�gProgramCh10Lab07.java�A�bmain()�����A��ѿ�J��
 * Source.txt�H�r�����ɦVŪ�J��ơA�M��A�N�o�Ǹ�Ƽg�X��
 * ��X��D:\MyData.txt�C
 */
public class ProgramCh10Lab07 {
	public static void main(String[] args) {
		String src = "Source.txt";
		String des = "D://MyDaya.txt";

		try (FileReader fr = new FileReader(src); FileWriter fw = new FileWriter(des)) {

			// �@��Ū�J�h�Ӧr��
			int len = 0;
			char[] data = new char[8192];
			while ((len = fr.read(data)) != -1) {
				fw.write(data, 0, len);

//			//�@��Ū�J�@�Ӧr��
//			int data;
//			while ((data = fr.read()) != -1) {
//				fw.write(data);

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
