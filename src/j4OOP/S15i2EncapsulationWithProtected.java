package j4OOP;

class Person152 {
	protected String profession;

	protected void displayInfo() {
		System.out.println("I am a " + profession);
	}
}

public class S15i2EncapsulationWithProtected {
	public static void main(String[] args) {

		Person152 t1 = new Person152();
		t1.profession = "teacher";
		t1.displayInfo();
	}
}