package JavaLabs_exercise;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/*
 * �s�gProgramCh10Lab03.java�A�bmain()�����N1��100��100��Long
 * ���A����ƻP�@��Float���A���B�I��17.625�g�J��X��D:\Numbers.dat�C
 * ������A�}���ɮ��`�ޡA���Numbers.dat�A���������j�p����O804��
 * �줸��
 */
public class ProgramCh10Lab03 {
	public static void main(String[] args) {

		String des = "D://Number.dat";

		try (FileOutputStream fos = new FileOutputStream(des, true); DataOutputStream dos = new DataOutputStream(fos)) {
			for (long i = 1; i <= 100; i++) {
				dos.writeLong(i);

			}
			dos.writeFloat(17.65f);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
