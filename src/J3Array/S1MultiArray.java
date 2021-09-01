package J3Array;

public class S1MultiArray {
	public static void main(String[] args) {
		S1MultiArray multiArray = new S1MultiArray();
		multiArray.threeArray();
	}

	public void multiArray() {
		// create a 2d array
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6, 9 }, { 7 }, };

		// calculate the length of each row
		System.out.println("Length of row 1: " + a[0].length);
		System.out.println("Length of row 2: " + a[1].length);
		System.out.println("Length of row 3: " + a[2].length);
	}

	public void multiArrayForLoop() {
		int[][] a = { { 1, -2, 3 }, { -4, -5, 6, 9 }, { 7 }, };

		for (int i = 0; i < a.length; ++i) {
			for (int j = 0; j < a[i].length; ++j) {
				System.out.println(a[i][j]);
			}
		}
	}

	public void multiArrayForEach() {
		// create a 2d array
		int[][] a = { { 1, -2, 3 }, { -4, -5, 6, 9 }, { 7 }, };

		// first for...each loop access the individual array
		// inside the 2d array
		for (int[] innerArray : a) {
			// second for...each loop access each element inside the row
			for (int data : innerArray) {
				System.out.println(data);
			}
		}
	}

	public void threeArray() {
		// create a 3d array
		int[][][] test = { { { 1, -2, 3 }, { 2, 3, 4 } }, { { -4, -5, 6, 9 }, { 1 }, { 2, 3 } } };

		// for..each loop to iterate through elements of 3d array
		for (int[][] array2D : test) {
			for (int[] array1D : array2D) {
				for (int item : array1D) {
					System.out.println(item);
				}
			}
		}
	}
}
