interface Shape {
	double PI=3.14;
	double perimeter();  // abstract method
}

class Circle implements Shape {
	double radius;

	Circle(double rad) {
		radius=rad;
	}

	public double perimeter() {
		return 2*PI*radius;
	}
}

class Rectangle implements Shape {
	double length;
	double breadth;

	Rectangle(double len, double br) {
		length=len;
		breadth=br;
	}

	public double perimeter() {
		return 2*(length+breadth);
	}
}

class calc {
	public static void main(String args[]) {
		Circle circle=new Circle(2.4);
		Rectangle rectangle=new Rectangle(10, 20);

		System.out.println("Perimeter of circle: "+circle.perimeter());

		System.out.println("Perimeter of rectangle: "+rectangle.perimeter());
	}
}
