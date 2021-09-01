package j4OOP;

interface Animal5 {
}

class Dog5 implements Animal5 {
}

public class S8i5InstanceWithInterface {
	public static void main(String[] args) {
		Dog5 d1 = new Dog5();
		System.out.println("Is d1 an instance of Animal: " + (d1 instanceof Animal5));
	}
}