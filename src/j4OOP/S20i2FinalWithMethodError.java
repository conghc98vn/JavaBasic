package j4OOP;

class FinalDemo {
	// create a final method
	public final void display() {
		System.out.println("This is a final method.");
	}
}

class Main extends FinalDemo {
	// try to override final method
//	public final void display() { // Không ghi đè lên được do hàm cha là final
//		System.out.println("The final method is overridden.");
//	}
}

public class S20i2FinalWithMethodError {
	public static void main(String[] args) {
		Main obj = new Main();
		obj.display();
	}
}
