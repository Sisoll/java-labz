package JavaLabs_exercise;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * <pre>
 *  
 * Q10_02.  
假設文字檔  Sample.txt 的內容如下：   
五局下半王建民(新聞、圖片、商品)遇到亂流，被運動家隊擊出兩隻安打， 
王建民又投出兩次保送，雙方打成4:4，洋基總教頭托瑞上場，換下王建民， 
由中繼投手斯特茲接手，五局結束雙方打平，王建民今年的第一次登板， 
確定與比賽勝負無關。 
 
運動家隊打者在八局下的一輪猛攻，即使洋基換了三任投手也擋不住，海灌了五分， 
將比數拉大為9:4。九局上洋基反攻無力，最終輸掉這場比賽。 
 
請撰寫一程式Q10_02.java來讀取此檔案的內容，然後於螢幕上顯示下列訊息： 
sample.txt 含有 xxx 個位元組， yyy 個字元， mmm 列資料。 
(要以 FileInputStream，FileReader，BufferedReader 分別來處裡)
 * 
 * &#64;mark { READ完之後再去讀他會在結尾的地方,這時候再去讀他會沒有東西; 
 * 所以如本題要再去算有幾行,需要再去重新建構BufferedInput的參數
 *       }
 * 
 * </pre>
 * 
 * @author SisolShie
 *
 */
public class Q10_02 {

	public static void main(String[] args) {

		Q10_02("file//Sample.txt");
		// Q10_02("D://MyDaya.txt");
	}

	static void Q10_02(String src) {
		try (FileInputStream fis = new FileInputStream(src);
				FileReader fr = new FileReader(src);
				BufferedReader br = new BufferedReader(new FileReader(src))) {

			int charNum = 0;
			while (fr.read() != -1) {
				charNum++;
			}

			int lineNum = 0;
			while (br.readLine() != null) {
				lineNum++;
			}

			System.out.print("sample.txt 含有 " + fis.available() + " 個位元組，" + charNum + "個字元，" + lineNum + " 列資料。");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
