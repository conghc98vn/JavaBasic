package j4OOP;

class Animal4 {
}

class Dog4 extends Animal4 {
	public void displayInfo() {
		System.out.println("I am a dog");
	}
}

public class S8i4InstanceWithDownCasting {
	public static void main(String[] args) {
		Dog4 d1 = new Dog4();
		Animal4 a1 = d1; // Upcasting

		
		if (a1 instanceof Dog4) {
			Dog4 d2 = (Dog4) a1; // Downcasting
			d2.displayInfo();
		}
	}
}
