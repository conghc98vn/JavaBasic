package j4OOP;

class Animal9 {

	public void eat() {
		System.out.println("I can eat");
	}

	public void sleep() {
		System.out.println("I can sleep");
	}
}

class Dog9 extends Animal9 {
	public void bark() {
		System.out.println("I can bark");
	}
}

public class S9i1InheritanceDemo1 {
	public static void main(String[] args) {
		Dog9 dog1 = new Dog9();

		dog1.eat();
		dog1.sleep();

		dog1.bark();
	}
}
