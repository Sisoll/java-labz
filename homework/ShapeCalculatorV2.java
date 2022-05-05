package homework;

/**
 * 
 * - 新建一個類別 ShapeCalculatorV2 - 兩個方法 getPerimeter 及 getArea - 建構 ShapeCalculator
 * 時可以傳入 Rectangle or Circle - 當呼叫 getPerimeter or getArea 時，能給我對應形狀的周長 or 面積
 * 
 * @author SisolShie
 *
 */
public class ShapeCalculatorV2 {

	public static void main(String[] args) {

		ShapeCalculatorV2 r = new ShapeCalculatorV2(10, 12);

		r.getArea(r.radius);
		r.getArea(r.x, r.y);

		r.getPerimeter(r.radius);
		r.getPerimeter(r.x, r.y);

	}

	int radius;
	int x, y;

	public ShapeCalculatorV2() {
	}

	public ShapeCalculatorV2(int radius) {
		this.radius = radius;
	}

	public ShapeCalculatorV2(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double getPerimeter(int radius) {
		this.radius = radius;
		double perimeter = 2 * radius * Math.PI;
		System.out.println("圓的周長是 " + perimeter);
		return perimeter;
	}

	public double getPerimeter(int x, int y) {
		this.x = x;
		this.y = y;
		double perimeter = 2 * (x + y);
		System.out.println("方形的周長是 " + perimeter);

		return perimeter;
	}

	public double getArea(int radius) {
		this.radius = radius;
		double area = radius * radius * Math.PI;
		System.out.println("圓的面積是 " + area);

		return area;
	}

	public double getArea(int x, int y) {
		this.x = x;
		this.y = y;
		double area = x * y;
		System.out.println("方形的面積是 " + area);
		return area;
	}

}
