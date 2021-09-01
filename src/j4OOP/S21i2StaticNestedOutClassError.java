package j4OOP;

class Animal212 {
	static class Mammal {
		public void displayInfo() {
			System.out.println("I am a mammal.");
		}
	}

	class Reptile {
		public void displayInfo() {
			System.out.println("I am a reptile.");
		}
	}

	public void eat() {
		System.out.println("I eat food.");
	}
}

public class S21i2StaticNestedOutClassError {
	public static void main(String[] args) {
		Animal212 animal = new Animal212();
		Animal212.Reptile reptile = animal.new Reptile();
		reptile.displayInfo();

		Animal212.Mammal mammal = new Animal212.Mammal();
		mammal.displayInfo();
//		mammal.eat(); // Không thể call hàm khác do Mammal là dược định nghĩa là static
	}
}
