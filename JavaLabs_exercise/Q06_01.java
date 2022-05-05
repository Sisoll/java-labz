package JavaLabs_exercise;

/**
 * <pre>
 * 1. 撰寫一個方法: void starSquare(int width, int height)，它可印出一個由 * 
 * 所組成的實心長方形，width與height分別表示長方形的寬與高。
 * 
 * @author SisolShie
 *
 *</pre>
 */
public class Q06_01 {

	public static void main(String[] args) {

		Q06_01 showStar = new Q06_01();
		showStar.starSquare(7, 2);
	}

	void starSquare(int width, int height) {

		for (var i = 0; i < height; i++) {
			for (var j = 0; j < width; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}