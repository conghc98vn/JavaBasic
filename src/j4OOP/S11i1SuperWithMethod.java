package j4OOP;

class Animal111 {

	// overridden method
	public void display() {
		System.out.println("I am an animal");
	}
}

class Dog111 extends Animal111 {

	// overriding method
	@Override
	public void display() {
		System.out.println("I am a dog");
	}

	public void printMessage() {

		// this calls overriding method
		display();

		// this calls overridden method
		super.display();
	}
}

public class S11i1SuperWithMethod {
	public static void main(String[] args) {
		Dog111 dog1 = new Dog111();
		dog1.printMessage();
	}
}
