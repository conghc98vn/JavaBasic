package J3Array;

import java.util.Arrays;

public class S2CopyArray {
	public static void main(String[] args) {
		S2CopyArray copyArray = new S2CopyArray();
		copyArray.copyMutilArrayWithArrayCopy();
	}

	public void shallowCopy() {
		int[] numbers = { 1, 2, 3, 4, 5, 6 };
		int[] positiveNumbers = numbers; // copying arrays

		for (int number : positiveNumbers) {
			System.out.print(number + ", ");
		}
	}

	public void shallowCopyChangeDemo() {
		int[] numbers = { 1, 2, 3, 4, 5, 6 };
		int[] positiveNumbers = numbers; // copying arrays

		numbers[0] = -1;

		for (int number : positiveNumbers) {
			System.out.print(number + ", ");
		}
	}

	public void deepCopy() {
		int[] source = { 1, 2, 3, 4, 5, 6 };
		int[] destination = new int[6];

		for (int i = 0; i < source.length; ++i) {
			destination[i] = source[i];
		}

		// converting array to string
		System.out.println(Arrays.toString(destination));
	}

	public void arrayCopyFunction() {
		int[] n1 = { 2, 3, 12, 4, 12, -2 };

		int[] n3 = new int[5];

		// Creating n2 array of having length of n1 array
		int[] n2 = new int[n1.length];

		// copying entire n1 array to n2
		System.arraycopy(n1, 0, n2, 0, n1.length);
		System.out.println("n2 = " + Arrays.toString(n2));

		// copying elements from index 2 on n1 array
		// copying element to index 1 of n3 array
		// 2 elements will be copied
		System.arraycopy(n1, 2, n3, 1, 2);
		System.out.println("n3 = " + Arrays.toString(n3));
	}

	public void conpyOfRange() {
		int[] source = { 2, 3, 12, 4, 12, -2 };

		// copying entire source array to destination
		int[] destination1 = Arrays.copyOfRange(source, 0, source.length);
		System.out.println("destination1 = " + Arrays.toString(destination1));

		// copying from index 2 to 5 (5 is not included)
		int[] destination2 = Arrays.copyOfRange(source, 2, 5);
		System.out.println("destination2 = " + Arrays.toString(destination2));

	}

	public void copyMutilArrayWithLoop() {
		int[][] source = { { 1, 2, 3, 4 }, { 5, 6 }, { 0, 2, 42, -4, 5 } };

		int[][] destination = new int[source.length][];

		for (int i = 0; i < destination.length; ++i) {

			// allocating space for each row of destination array
			destination[i] = new int[source[i].length];

			for (int j = 0; j < destination[i].length; ++j) {
				destination[i][j] = source[i][j];
			}
		}

		// displaying destination array
		System.out.println(Arrays.deepToString(destination));
	}

	public void copyMutilArrayWithArrayCopy() {
		int[][] source = { { 1, 2, 3, 4 }, { 5, 6 }, { 0, 2, 42, -4, 5 } };

		int[][] destination = new int[source.length][];

		for (int i = 0; i < source.length; ++i) {

			// allocating space for each row of destination array
			destination[i] = new int[source[i].length];
			System.arraycopy(source[i], 0, destination[i], 0, destination[i].length);
		}

		// displaying destination array
		System.out.println(Arrays.deepToString(destination));
	}
}
