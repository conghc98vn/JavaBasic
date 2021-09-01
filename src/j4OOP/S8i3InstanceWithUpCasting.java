package j4OOP;

class Animal3 {
	public void displayInfo() {
		System.out.println("I am an animal.");
	}
}

class Dog3 extends Animal3 {
}

public class S8i3InstanceWithUpCasting {
	public static void main(String[] args) {
		Dog3 d1 = new Dog3();
		Animal3 a1 = d1;
		a1.displayInfo();
	}

}
