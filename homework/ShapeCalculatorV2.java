package homework;

/**
 * 
 * 新建一個類別 ShapeCalculatorV2 - 兩個方法 getPerimeter 及 getArea - 建構 ShapeCalculator
 * 時可以傳入 Rectangle or Circle - 當呼叫 getPerimeter or getArea 時，能給我對應形狀的周長 or 面積
 * 
 * @author SisolShie
 *
 */
public class ShapeCalculatorV2 {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle();
		rectangle.width = 5;
		rectangle.length = 8;

		Circle circle = new Circle();
		circle.radius = 10;

		ShapeCalculatorV2 r = new ShapeCalculatorV2(rectangle);
		ShapeCalculatorV2 t = new ShapeCalculatorV2(circle);

		r.getArea();
		t.getPerimeter();

	}

	int radius;
	int length;
	int width;
	String shape;

	public ShapeCalculatorV2() {
	}

	public ShapeCalculatorV2(Circle circle) {
		this.radius = circle.radius;
		this.shape = "circle";
	}

	public ShapeCalculatorV2(Rectangle rectangle) {
		this.length = rectangle.length;
		this.width = rectangle.width;
		this.shape = "rectangle";
	}

	public void getPerimeter() {

		if (this.shape.equals("circle")) {
			double perimeter = 2 * radius * Math.PI;
			System.out.println("圓的周長是 " + perimeter);
		} else {
			double perimeter = 2 * (length + width);
			System.out.println("方形的周長是 " + perimeter);
		}
	}

	public void getArea() {
		if (this.shape.equals("circle")) {
			double cAare = radius * radius * Math.PI;
			System.out.println("圓的面積是 " + cAare);
		} else {
			double tArea = length * width;
			System.out.println("方形的面積是 " + tArea);
		}
	}
}
