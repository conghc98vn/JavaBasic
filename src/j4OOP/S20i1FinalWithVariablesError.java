package j4OOP;

public class S20i1FinalWithVariablesError {
	public static void main(String[] args) {
		// create a final variable
		final int AGE = 32;

		// try to change the final variable
//		AGE = 45; // Không thể update biến AGE vì nó là hằng số và sử dụng final
		System.out.println("Age: " + AGE);
	}
}
