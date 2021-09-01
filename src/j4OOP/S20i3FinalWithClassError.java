package j4OOP;

final class FinalClass {
	public void display() {
		System.out.println("This is a final method.");
	}
}

// try to extend the final class
//class Main extends FinalClass { // Không kế thừa được do class FinalClass định danh là fianl
//	public void display() {
//		System.out.println("The final method is overridden.");
//	}

public class S20i3FinalWithClassError {
	Main obj = new Main();
//    obj.display();
}
