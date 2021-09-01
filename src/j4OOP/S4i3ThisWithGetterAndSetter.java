package j4OOP;

public class S4i3ThisWithGetterAndSetter {
	String name;

	// setter method
	void setName(String name) {
		this.name = name;
	}

	// getter method
	String getName() {
		return this.name;
	}

	public static void main(String[] args) {
		S4i3ThisWithGetterAndSetter obj = new S4i3ThisWithGetterAndSetter();

		// calling the setter and the getter method
		obj.setName("cafedevn");
		System.out.println("obj.name: " + obj.getName());
	}
}
