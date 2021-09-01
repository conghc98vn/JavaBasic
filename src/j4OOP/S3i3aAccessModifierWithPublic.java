package j4OOP;

public class S3i3aAccessModifierWithPublic {
	public static void main(String[] args) {
		// accessing the public class
		S3i3bAccessModifierWithPublic animal = new S3i3bAccessModifierWithPublic();

		// accessing the public variable
		animal.legCount = 4;
		// accessing the public method
		animal.display();
	}
}
