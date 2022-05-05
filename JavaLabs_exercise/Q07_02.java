package JavaLabs_exercise;

import java.util.Calendar;

/**
 *
 * 請利用靜態區塊來設定StaticCodeBlock類別的靜態變數season的初值。 請參考下列條件來設定靜態變數season的初值：
 * 如果載入此類別檔的月份為 3, 4, 5 月 season 的初值為 "春天" 如果載入此類別檔的月份為 6, 7, 8 月 season 的初值為
 * "夏天" 如果載入此類別檔的月份為 9,10,11 月 season 的初值為 "秋天" 如果載入此類別檔的月份為 12, 1, 2 月 season
 * 的初值為 "冬天"
 * 
 * 
 * 
 * 提示: import java.util.* ; //... Calendar d = Calendar.getInstance() ; int
 * month = d.get( Calendar.MONTH ) ; 可以傳回Calendar.MONTH的代號，0 表示 1 月，1 表示 2 月...
 * 11 表示 12 月
 * 
 * @author SisolShie
 *
 */

class StaticCodeBlock {
	static String season;

	static {
		Calendar d = Calendar.getInstance();
		int month = d.get(Calendar.MONTH);

		switch (month) {
		case 3:
		case 4:
		case 5:
			season = "春天";
			break;
		case 6:
		case 7:
		case 8:
			season = "夏天";
			break;
		case 9:
		case 10:
		case 11:
			season = "秋天";
			break;
		case 12:
		case 1:
		case 2:
			season = "冬天";
			break;
		default:
			break;
		}
	}
}

public class Q07_02 {
	public static void main(String[] args) {
		System.out.println(StaticCodeBlock.season);
	}
}
