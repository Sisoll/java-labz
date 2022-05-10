package JavaLabs_exercise;

import java.util.Scanner;

/**
 * 
 * 3. 由鍵盤輸入代表某個日期的三個數字yyyy,mm,dd，算出該日期是該年的第幾天。
 * 
 * @author SisolShie
 *
 */
public class Q05_03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int yyyy = scanner.nextInt();
		int mm = scanner.nextInt();
		int dd = scanner.nextInt();
		scanner.close();

		var isLeap = false;
		var day = 0;

		if (yyyy < 0 || yyyy > 10000 || mm <= 0 || mm > 12 || dd < 0 || dd > 32) {
			System.out.println("wrong input");
		}

		else {
			if (yyyy % 4 == 0 && yyyy % 100 != 0 || yyyy % 400 == 0) {
				isLeap = true;
			}

			if (dd == 31 && (mm == 2 || mm == 4 || mm == 6 || mm == 9 || mm == 11)) {
				System.out.println("worng");
			} else if (dd == 30 && mm == 2) {
				System.out.println("worng");
			} else if (dd == 29 && mm == 2 && isLeap == false) {
				System.out.println("worng");
			} else {
				for (var i = 1; i < mm; i++) {
					switch (i) {
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						day += 31;
						break;
					case 4:
					case 6:
					case 9:
					case 11:
						day += 30;
						break;
					case 02:
						if (isLeap) {
							day += 29;
						} else {
							day += 28;
						}
					default:
						break;
					}
				}
				day += dd;

				System.out.println("輸入" + yyyy + " " + mm + "  " + dd);
				System.out.println("得到的是 " + yyyy + " 年的第 " + day + " " + "天");
			}
		}
	}
}
