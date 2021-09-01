package j4OOP;

class Animal102 {
	public void displayInfo() {
		System.out.println("I am an animal.");
	}
}

class Dog102 extends Animal102 {
	public void displayInfo() {
		super.displayInfo();
		System.out.println("I am a dog.");
	}
}

public class S10i2OverridingWithSuper {
	public static void main(String[] args) {
		Dog102 d1 = new Dog102();
		d1.displayInfo();
	}
}
