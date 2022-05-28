package JavaLabs_exercise;

import java.util.Calendar;

import Test.MyLogger;

/**
 * <pre>
 * 請利用靜態區塊來設定StaticCodeBlock類別的靜態變數season的初值。 請參考下列條件來設定靜態變數season的初值：
 * 如果載入此類別檔的月份為 3, 4, 5 月 season 的初值為 "春天" 如果載入此類別檔的月份為 6, 7, 8 月 season 的初值為
 * "夏天" 如果載入此類別檔的月份為 9,10,11 月 season 的初值為 "秋天" 如果載入此類別檔的月份為 12, 1, 2 月 season
 * 的初值為 "冬天"
 * 
 * 
 * 提示: import java.util.* ; //... Calendar d = Calendar.getInstance() ; int
 * month = d.get( Calendar.MONTH ) ; 可以傳回Calendar.MONTH的代號，0 表示 1 月，1 表示 2 月...
 * 11 表示 12 月
 * 
 * &#64;author SisolShie
 * </pre>
 */

class StaticCodeBlock {
	static String season;

	static {
		Calendar d = Calendar.getInstance();  //取得現在的時間
		int month = d.get(Calendar.MONTH);    //取得現在的月份
		//int month  = Calendar.MONTH ;
		//System.out.println(Calendar.MARCH);
		
		
		MyLogger.debug(month);
		System.out.println(month);
		
		switch (month) {
		case Calendar.MARCH:
		case Calendar.APRIL:
		case Calendar.MAY:
			season = "春天";
			break;
		case Calendar.JUNE:
		case Calendar.JULY:
		case Calendar.AUGUST:
			season = "夏天";
			break;
		case Calendar.SEPTEMBER:
		case Calendar.OCTOBER:
		case Calendar.NOVEMBER:
			season = "秋天";
			break;
		case Calendar.DECEMBER:
		case Calendar.JANUARY:
		case Calendar.FEBRUARY:
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
