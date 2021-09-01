package j4OOP;

public class S8i2InstanceWithInheritance {
	public static void main(String[] args) {
		Dog d1 = new Dog();

		// checks if d1 is an object of Dog
		System.out.println("Is d1 an instance of Dog: " + (d1 instanceof Dog));

		// checks if d1 is an object of Animal
		System.out.println("Is d1 an instance of Animal: " + (d1 instanceof Animal1));
	}
}

class Animal1 {
}

// Dog class is a subclass of Animal
class Dog extends Animal1 {
}