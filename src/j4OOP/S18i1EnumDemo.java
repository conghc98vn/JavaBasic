package j4OOP;

enum Size {
	SMALL, MEDIUM, LARGE, EXTRALARGE
}

class Test181 {
	Size pizzaSize;

	public Test181(Size pizzaSize) {
		this.pizzaSize = pizzaSize;
	}

	public void orderPizza() {
		switch (pizzaSize) {
		case SMALL:
			System.out.println("I ordered a small size pizza.");
			break;
		case MEDIUM:
			System.out.println("I ordered a medium size pizza.");
			break;
		default:
			System.out.println("I don't know which one to order.");
			break;
		}
	}
}

public class S18i1EnumDemo {
	public static void main(String[] args) {
		Test181 t1 = new Test181(Size.MEDIUM);
		   t1.orderPizza();
	}
}
