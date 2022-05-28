package homework;

/**
 * <pre>
 * 寫一個方法，傳入字串型態參數，回傳值為一自訂 Enum (Odd, Even, Unknown) 
 * 如果字串是 null，回傳 Unknown
 * 去掉字串頭尾空白 把字串轉成 int 
 * (adv: 字串可以任意填，如果無法轉成數字，視為 -1) 
 * 如果得到的數字小於零，回傳 Unkown ;
 * 是偶數，回傳 Even , 否則回傳 Odd
 * </pre>
 * 
 * @author SisolShie
 *
 */
public class StreamLambda02 {

	public static void main(String[] args) {
		System.out.println(dis("85"));

	}

	public static StringType dis(String str) {
		if (str == null) {
			return StringType.Unknown;
		}
		try {
			int intStr = Integer.parseInt(str.trim());
			if (intStr < 0) {
				return StringType.Unknown;
			} else {
				if (intStr % 2 == 0) {
					return StringType.Even;
				} else {
					return StringType.Odd;
				}
			}
		} catch (

		NumberFormatException e) {
			return StringType.Unknown;
		}
	}
}

enum StringType {
	Odd, Even, Unknown;
}
