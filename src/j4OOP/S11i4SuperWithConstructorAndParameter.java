package j4OOP;

class Animal114 {
	
	// default or no-arg constructor
	Animal114() {
		System.out.println("I am an animal");
	}

	// parameterized constructor
	Animal114(String type) {
		System.out.println("Type: " + type);
	}
}

class Dog114 extends Animal114 {

	// default constructor
	Dog114() {

		// calling parameterized constructor of the superclass
		super("Animal");

		System.out.println("I am a dog");
	}
}

public class S11i4SuperWithConstructorAndParameter {
	public static void main(String[] args) {
		Dog114 obj = new Dog114();
	}
}
