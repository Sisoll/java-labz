package JavaLabs_exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
     �s�gProgramCh10Lab01.java�A�bmain()��k��Ū���M�פU��
    Source.gif�ɮפ�����ơA�M��A�N�o�Ǹ�Ƽg�X���X��
    C:\data��Ƨ����U�A�s�ɦW��MyData.gif�C
        
     �{�������P�_C:\data��Ƨ��O�_�s�b�A�p�G���s�b�A�зs�ئ���Ƨ��C

 */
public class ProgramCh10Lab01 {
	public static void main(String[] args) {
		String src = "Source.gif";
		String dir = "C:\\data";
		String des = "C:\\data\\MyData.gif";
		File file = new File(dir);

		if (!(file.exists())) {
			System.out.println(file.mkdir()); // �o��|�h�s�@dir
		}

		try (FileInputStream fis = new FileInputStream(src); FileOutputStream fos = new FileOutputStream(des);) {
			int data;
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
