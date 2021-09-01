package j4OOP;

enum Size23 {

	// enum constants calling the enum constructors
	SMALL23("The size is small."), MEDIUM23("The size is medium."), LARGE23("The size is large."),
	EXTRALARGE23("The size is extra large.");

	private final String pizzaSize;

	// private enum constructor
	private Size23(String pizzaSize) {
		this.pizzaSize = pizzaSize;
	}

	public String getSize() {
		return pizzaSize;
	}
}

public class S23EnumConstructor {
	public static void main(String[] args) {
		Size23 size = Size23.SMALL23;
		System.out.println(size.getSize());
	}
}
