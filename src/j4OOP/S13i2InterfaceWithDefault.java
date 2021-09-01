package j4OOP;

interface Polygon132 {
	void getArea();

	default void getSides() {
		System.out.println("I can get sides of polygon.");
	}
}

class Rectangle132 implements Polygon132 {
	public void getArea() {
		int length = 6;
		int breadth = 5;
		int area = length * breadth;
		System.out.println("The area of the rectangle is " + area);
	}

	public void getSides() {
		System.out.println("I have 4 sides.");
	}
}

class Square132 implements Polygon132 {
	public void getArea() {
		int length = 5;
		int area = length * length;
		System.out.println("The area of the square is " + area);
	}
}

public class S13i2InterfaceWithDefault {
	public static void main(String[] args) {
		Rectangle132 r1 = new Rectangle132();
		r1.getArea();
		r1.getSides();

		Square132 s1 = new Square132();
		s1.getArea();
	}
}
