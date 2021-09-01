package j4OOP;

interface Polygon222 {
	public void display();
}

class AnonymousDemo222 {
	public void createClass() {

		// anonymous class implementing interface
		Polygon222 p1 = new Polygon222() {
			public void display() {
				System.out.println("Inside an anonymous class.");
			}
		};
		p1.display();
	}
}

public class S22i2AnonymousClassWithInterface {
	public static void main(String[] args) {
		AnonymousDemo222 an = new AnonymousDemo222();
		an.createClass();
	}
}
