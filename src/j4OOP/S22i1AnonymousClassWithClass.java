package j4OOP;

class Polygon221 {
	public void display() {
		System.out.println("Inside the Polygon class");
	}
}

class AnonymousDemo {
	public void createClass() {

		// creation of anonymous class extending class Polygon
		Polygon221 p1 = new Polygon221() {
			public void display() {
				System.out.println("Inside an anonymous class.");
			}
		};
		p1.display();
	}
}

public class S22i1AnonymousClassWithClass {
	public static void main(String[] args) {
		AnonymousDemo an = new AnonymousDemo();
		an.createClass();
	}
}
