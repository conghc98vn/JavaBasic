package j4OOP;

public class S5i2StaticWithVariables {
	public static void main(String[] args) {
		Test obj = new Test();

		// access the non-static variable
		System.out.println("min + 1 = " + (obj.min + 1));

		// access the static variable
		System.out.println("max + 1 = " + (Test.max + 1));
	}
}

class Test {

	// static variable
	static int max = 10;

	// non-static variable
	int min = 5;
}