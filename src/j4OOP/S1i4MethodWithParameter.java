package j4OOP;

public class S1i4MethodWithParameter {
	public static void main(String[] args) {
		int result, n;

		n = 3;
		result = square(n);
		System.out.println("Square of 3 is: " + result);

		n = 4;
		result = square(n);
		System.out.println("Square of 4 is: " + result);

		// calling methods
		System.out.println("10 + 20 = " + getIntegerSum(10, 20));
		System.out.println("20 x 40 = " + multiplyInteger(20, 40));

		for (int i = 1; i <= 5; i++) {

			// method call
			int resultExample = getSquare(i);
			System.out.println("Square of " + i + " is: " + resultExample);
		}
	}

	// method
	static int square(int i) {
		return i * i;
	}

	// method definition
	public static int getIntegerSum(int i, int j) {
		return i + j;
	}

	// method definition
	public static int multiplyInteger(int x, int y) {
		return x * y;
	}

	// method defined
	private static int getSquare(int x) {
		return x * x;
	}
}
