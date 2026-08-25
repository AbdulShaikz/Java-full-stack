abstract class Shape{
	abstract double calculateArea();
}

// Shape shape = new Shape(); // Compile-time error: abstract classes cannot be instantiated.

class Circle extends Shape {
	private final double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double calculateArea() {
		return Math.PI * radius * radius;
	}
}

class Rectangle extends Shape {
	private final double length;
	private final double width;

	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	double calculateArea() {
		return length * width;
	}
}

class Triangle extends Shape {
	private final double base;
	private final double height;

	Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	double calculateArea() {
		return 0.5 * base * height;
	}
}

public class ShapeArea {
	public static void main(String[] args) {
		Shape[] shapes = {
			new Circle(5),
			new Rectangle(4, 6),
			new Triangle(4, 3)
		};

		for (Shape shape : shapes) {
			System.out.println("Area: " + shape.calculateArea());
		}
	}
}
