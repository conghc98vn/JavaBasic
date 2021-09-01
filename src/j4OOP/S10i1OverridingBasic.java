package j4OOP;

class Animal101 {
	public void displayInfo() {
		System.out.println("I am an animal.");
	}
}

class Dog101 extends Animal101 {
	@Override
	public void displayInfo() {
		System.out.println("I am a dog.");
	}
}

public class S10i1OverridingBasic {
	public static void main(String[] args) {
		Dog101 d1 = new Dog101();
		d1.displayInfo();
	}
}
