package j4OOP;

abstract class Animal141 {
	public abstract void makeSound();
}

class Dog141 extends Animal141 {
	@Override
	public void makeSound() {
		System.out.println("Bark bark..");
	}
}

class Cat141 extends Animal141 {
	@Override
	public void makeSound() {
		System.out.println("Meow meow..");
	}
}

public class S14i1PolymorphismWithOveride {
	public static void main(String[] args) {
		Dog141 d1 = new Dog141();
		d1.makeSound();

		Cat141 c1 = new Cat141();
		c1.makeSound();
	}
}
