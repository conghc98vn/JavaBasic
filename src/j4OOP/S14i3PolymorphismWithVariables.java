package j4OOP;

class Animal143 {
	public void displayInfo() {
		System.out.println("I am an animal.");
	}
}

class Dog143 extends Animal143 {
	@Override
	public void displayInfo() {
		System.out.println("I am a dog.");
	}
}

public class S14i3PolymorphismWithVariables {
	public static void main(String[] args) {
		// declaration of object variable a1 of the Animal class
		Animal143 a1;

		// object creation of the Animal class
		a1 = new Animal143();
		a1.displayInfo();
		// object creation of the dog class
		a1 = new Dog143();
		a1.displayInfo();
	}
}
