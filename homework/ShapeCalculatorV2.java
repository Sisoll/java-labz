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
		ShapeCalculatorV2 c = new ShapeCalculatorV2(circle);

		System.out.println(r.getArea());
		System.out.println(r.getPerimeter());

		System.out.println(c.getArea());
		System.out.println(c.getPerimeter());

	}

	int radius;
	int length;
	int width;
	Shape shape;

	public ShapeCalculatorV2(Shape shape) {
		this.shape = shape;
	}

	public double getPerimeter() {	
		return this.shape.getPerimeter();
	}

	public double getArea() {
		return this.shape.getArea();
	}
}
