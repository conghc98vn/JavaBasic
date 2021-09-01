package j4OOP;

public class S3i2AccessModifierWithProtected extends Animal {
	public static void main(String[] args) {
		S3i2AccessModifierWithProtected dog = new S3i2AccessModifierWithProtected();
		dog.display();
	}

}

class Animal {
	protected void display() {
		System.out.println("I am an animal");
	}
}