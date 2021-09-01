package j4OOP;

abstract class Animal12 {
	abstract void makeSound();

}

class Dog12 extends Animal12 {
	public void makeSound() {
		System.out.println("Bark bark.");
	}
}

class Cat12 extends Animal12 {
	public void makeSound() {
		System.out.println("Meows ");
	}
}

public class S12AbstracDemo {
	public static void main(String[] args) {
		Dog12 d1 = new Dog12();
		d1.makeSound();

		Cat12 c1 = new Cat12();
		c1.makeSound();
	}
}
