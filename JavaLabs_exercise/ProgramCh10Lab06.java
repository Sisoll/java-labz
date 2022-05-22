package JavaLabs_exercise;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/* 
 * �s�gProgramCh10Lab06.java�A�bmain()����Ū���ѫe�@��Lab�Ҽg�J
 * ��Object.dat���T�Ӫ���A�M����ܦb�ù��W�C
 */
public class ProgramCh10Lab06 {
	public static void main(String[] args) {
		String src = "D://Object.dat";
		// File file = new File(src);
		// System.out.println(file.exists());

		try (FileInputStream fis = new FileInputStream(src); ObjectInputStream ois = new ObjectInputStream(fis)) {
			while (true) {
				Object o = ois.readObject();

				if (o instanceof String) {
					System.out.println((String) o);
				} else if (o instanceof Integer) {
					System.out.println(o);
				} else if (o instanceof Double) {
					System.out.println(o);
				} else {
					break;
				}
			}
		} catch (

		ClassNotFoundException cnfe) {
			System.out.println("class wrong");

		} catch (FileNotFoundException fnfe) {
			System.out.println("no file");

		} catch (EOFException eofe) {
			System.out.println(eofe.getMessage());
		} catch (IOException ioe) {
			System.out.println("IOe");
			ioe.printStackTrace();
		}

	}
}