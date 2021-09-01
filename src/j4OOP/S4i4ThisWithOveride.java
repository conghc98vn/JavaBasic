package j4OOP;

public class S4i4ThisWithOveride {

	private int a, b;

	// constructor with 2 parameters
	private S4i4ThisWithOveride(int i, int j) {
		this.a = i;
		this.b = j;
	}

	// constructor with single parameter
	private S4i4ThisWithOveride(int i) {
		// invokes the constructor with 2 parameters
		this(i, i);
	}

	// constructor with no parameter
	private S4i4ThisWithOveride() {
		// invokes the constructor with single parameter
		this(0);
	}

	@Override
	public String toString() {
		return this.a + " + " + this.b + "i";
	}

	public static void main(String[] args) {
		// creating object of Complex class
		// calls the constructor with 2 parameters
		S4i4ThisWithOveride c1 = new S4i4ThisWithOveride(2, 3);

		// calls the constructor with a single parameter
		S4i4ThisWithOveride c2 = new S4i4ThisWithOveride(3);

		// calls the constructor with no parameters
		S4i4ThisWithOveride c3 = new S4i4ThisWithOveride();

		// print objects
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}
