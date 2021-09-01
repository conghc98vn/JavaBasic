package j4OOP;

import java.lang.Math;

interface Polygon133 {
	void getArea();

	// calculate the perimeter of a Polygon
	default void getPerimeter(int... sides) {
		int perimeter = 0;
		for (int side : sides) {
			perimeter += side;
		}

		System.out.println("Perimeter: " + perimeter);
	}
}

class Triangle133 implements Polygon133 {
	private int a, b, c;
	private double s, area;

// initializing sides of a triangle
	Triangle133(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		s = 0;
	}

// calculate the area of a triangle
	public void getArea() {
		s = (double) (a + b + c) / 2;
		area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		System.out.println("Area: " + area);
	}
}

public class S13i3InterfaceDemo {
	public static void main(String[] args) {
		Triangle133 t1 = new Triangle133(2, 3, 4);

		// calls the method of the Triangle class
		t1.getArea();

		// calls the method of Polygon
		t1.getPerimeter(2, 3, 4);
	}
}
