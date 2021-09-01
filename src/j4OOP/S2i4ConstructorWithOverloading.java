package j4OOP;

public class S2i4ConstructorWithOverloading {

	String domainName;

	// constructor with no parameter
	public S2i4ConstructorWithOverloading() {
		this.domainName = "default";
	}

	// constructor with parameter
	public S2i4ConstructorWithOverloading(String domainName) {
		this.domainName = domainName;
	}

	public void getName() {
		System.out.println(this.domainName);
	}

	public static void main(String[] args) {
		// calling the constructor with no parameter
		S2i4ConstructorWithOverloading obj1 = new S2i4ConstructorWithOverloading();
		// calling the constructor with single parameter
		S2i4ConstructorWithOverloading obj2 = new S2i4ConstructorWithOverloading("Test text");

		obj1.getName();
		obj2.getName();
	}
}
