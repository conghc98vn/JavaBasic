package j4OOP;

class Animal113 {

	// default or no-arg constructor of class Animal
	Animal113() {
		System.out.println("I am an animal");
	}
}

class Dog113 extends Animal113 {

	// default or no-arg constructor of class Dog
	Dog113() {

		// calling default constructor of the superclass
		super();

		System.out.println("I am a dog");
	}
}

public class S11i3SuperWithConstructor {
	public static void main(String[] args) {
		Dog113 obj = new Dog113();
	}
}
