package JavaLabs_exercise;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/*
 * �s�gProgramCh10Lab05.java�A�bmain()�����A�N�r��  
 * "Hello, World, �j�a�n"�B��ƪ��� new Integer(54321)
 * �P�B�I�ƪ��� new Double(17.625)�g�J��X�� D:\Object.dat�C
 */
public class ProgramCh10Lab05 {
	public static void main(String[] args) {

		String des = "D://Object.dat";

		try (FileOutputStream fos = new FileOutputStream(des); ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject("Hello, World, �j�a�n");
			oos.writeObject(543521);
			oos.writeObject(17.625);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
