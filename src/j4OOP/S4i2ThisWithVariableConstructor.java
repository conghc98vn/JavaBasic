package j4OOP;

public class S4i2ThisWithVariableConstructor {
	int age;

	public S4i2ThisWithVariableConstructor(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		S4i2ThisWithVariableConstructor obj = new S4i2ThisWithVariableConstructor(8);
		System.out.println("obj.age = " + obj.age);
	}
}
