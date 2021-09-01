package j4OOP;

class Animal211 {

	// inner class
	class Reptile {
		public void displayInfo() {
			System.out.println("I am a reptile.");
		}
	}

	// static class
	static class Mammal {
		public void displayInfo() {
			System.out.println("I am a mammal.");
		}
	}
}

public class S21i1StaticNested {
	public static void main(String[] args) {
		// object creation of the outer class
		Animal211 animal = new Animal211();

		// object creation of the non-static class
		Animal211.Reptile reptile = animal.new Reptile();
		reptile.displayInfo();

		// object creation of the static nested class
		Animal211.Mammal mammal = new Animal211.Mammal();
		mammal.displayInfo();
	}
}
