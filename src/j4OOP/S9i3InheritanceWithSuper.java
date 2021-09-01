package j4OOP;

class Animal93 {
	public Animal93() {
		System.out.println("I am an Animal");
	}

	public void eat() {
		System.out.println("I can eat");
	}
}

class Dog93 extends Animal93 {
	public Dog93() {
		super();
		System.out.println("I am a dog");
	}

	@Override
	public void eat() {
		super.eat();
		System.out.println("I eat dog food");
	}

	public void bark() {
		System.out.println("I can bark");
	}
}

public class S9i3InheritanceWithSuper {
	public static void main(String[] args) {
		Dog93 dog1 = new Dog93();

		dog1.eat();
		dog1.bark();
	}
}
