package j4OOP;

class Animal112 {
	protected String type = "animal";
}

class Dog112 extends Animal112 {
	public String type = "mammal";

	public void printType() {
		System.out.println("I am a " + type);
		System.out.println("I am an " + super.type);
	}
}

public class S11i2SuperWithVariables {
	public static void main(String[] args) {
		Dog112 obj = new Dog112();
		obj.printType();
	}
}
