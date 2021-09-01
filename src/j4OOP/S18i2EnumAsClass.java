package j4OOP;

enum Size182 {
	SMALL, MEDIUM, LARGE, EXTRALARGE;

	public String getSize() {

		// this will refer to the object SMALL
		switch (this) {
		case SMALL:
			return "small";

		case MEDIUM:
			return "medium";

		case LARGE:
			return "large";

		case EXTRALARGE:
			return "extra large";

		default:
			return null;
		}
	}
}

public class S18i2EnumAsClass {
	public static void main(String[] args) {
		// calling the method getSize() using the object SMALL
		System.out.println("The size of the pizza is " + Size182.SMALL.getSize());
	}
}
