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

	public ShapeCalculatorV2(Shape shape) {
		/*
		 * 這邊會同時印出來 System.out.println("面積: " + shape.getArea());
		 * System.out.println("周長: " + shape.getPerimeter());
		 */
		if (shape instanceof Circle) {
			this.radius = ((Circle) shape).radius;
		} else if (shape instanceof Rectangle) {
			this.width = ((Rectangle) shape).width;
			this.length = ((Rectangle) shape).length;
		}
	}

	public double getPerimeter() {
		double perimeter = 0;
		if (radius != 0) {
			perimeter = 2 * radius * Math.PI;
		} else if (length != 0 && width != 0) {
			perimeter = 2 * (length + width);
		} else {
			perimeter = -1;
		}
		return perimeter;
	}

	public double getArea() {
		double area = 0;
		if (radius != 0) {
			area = radius * radius * Math.PI;
		} else if (length != 0 && width != 0) {
			area = length * width;
		} else {
			area = -1;
		}
		return area;
	}
}
