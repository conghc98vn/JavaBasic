package j4OOP;

class Animal92 {
	protected String type = "animal";

	public void eat() {
		System.out.println("I can eat");
	}

	public void sleep() {
		System.out.println("I can sleep");
	}
}

class Dog92 extends Animal92 {

	@Override
	public void eat() {
		System.out.println("I eat dog food");
	}

	public void bark() {
		System.out.println("I can bark");
	}
}

public class S9i2InheritanceWithOveride {
	public static void main(String[] args) {
		Dog92 dog1 = new Dog92();
		dog1.eat();
		dog1.sleep();
		dog1.bark();
	}
}
