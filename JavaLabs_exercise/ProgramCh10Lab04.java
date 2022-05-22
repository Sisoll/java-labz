package JavaLabs_exercise;

import java.io.DataInputStream;
import java.io.FileInputStream;

/*
 * �s�gProgramCh10Lab04.java�A�bmain()����Ū���ѫe�@��Lab�Ҽg�J
 * ��D:\Numbers.dat��100��Long���A����ƻP�@��Float���A���B�I�ơA
 * �M����ܦb�ù��W�C
 */
public class ProgramCh10Lab04 {
	/**
	 * 
	 */

	public static void main(String[] args) {
		String src = "D://Number.dat";

		try (FileInputStream fis = new FileInputStream(src); DataInputStream dis = new DataInputStream(fis)) {
			for (

					long i = 0; i < 100; i++) {
				System.out.println(dis.readLong());
			}

			System.out.println(dis.readFloat());
		} catch (

		Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
