package JavaLabs_exercise;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
      �s�gProgramCh10Lab02.java�A�bmain()��k��Ū���M��
      �U��Source.gif�ɮפ�����ơA�M��A�N�o�Ǹ�Ƽg�X���X��
   D:\data��Ƨ����U�A�s�ɦW��MyData.gif�C
   
       �o�ӽm�߻Plab01�p�P�A���L�n�[�WBufferedInputStream
       �PBufferedOutputStream������O�C

 */
public class ProgramCh10Lab02 {
	public static void main(String[] args) {

		String src = "Source.gif";
		String des = "C:\\data\\MyDataB.gif";

		int data = 0;
		try (FileInputStream fis = new FileInputStream(src);
				BufferedInputStream bis = new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream(des);
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			while (!((data = (bis.read())) == -1)) {
				bos.write(data);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
