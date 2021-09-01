package J3Array;

public class S0Array {
	public static void main(String[] args) {
		S0Array arrayExample = new S0Array();
		arrayExample.arrayExample();
	}

	public void arrayExample() {
		// create an array of length 5
		int[] age = new int[5];

		// access each element of the array using the index number
		System.out.println(age[0]);
		System.out.println(age[1]);
		System.out.println(age[2]);
		System.out.println(age[3]);
		System.out.println(age[4]);
	}

	public void arrayExample1() {
		// create an array of length 5
		int[] age = new int[5];

		// accessing elements using for loop
		for (int i = 0; i < 5; ++i) {
			System.out.println(age[i]);
		}
	}

	public void arrayExample2() {
		// create an array
		int[] age = { 12, 4, 5, 2, 5 };

		// access elements of tha arau
		for (int i = 0; i < 5; ++i) {
			System.out.println("Element at index " + i + ": " + age[i]);
		}
	}

	public void arrayExample3() {
		int[] age = new int[5];

		// insert 14 to third element
		age[2] = 14;

		// insert 34 to first element
		age[0] = 34;

		for (int i = 0; i < 5; ++i) {
			System.out.println("Element at index " + i + ": " + age[i]);
		}
	}

	public void arrayExample4() {
		int[] numbers = { 2, -9, 0, 5, 12, -25, 22, 9, 8, 12 };
		int sum = 0;
		Double average;

		// for each loop is used to access elements
		for (int number : numbers) {
			sum += number;
		}

		int arrayLength = numbers.length;

		// Change sum and arrayLength to double as average is in double
		average = ((double) sum / (double) arrayLength);

		System.out.println("Sum = " + sum);
		System.out.println("Average = " + average);
	}
}
