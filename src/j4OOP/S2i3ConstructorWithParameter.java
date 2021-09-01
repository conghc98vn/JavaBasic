package j4OOP;

public class S2i3ConstructorWithParameter {

	int wheels;

	public S2i3ConstructorWithParameter(int wheels) {
		this.wheels = wheels;
		System.out.println(wheels + " wheeler vehicle created.");
	}

	public static void main(String[] args) {
		S2i3ConstructorWithParameter v1 = new S2i3ConstructorWithParameter(2);
		S2i3ConstructorWithParameter v2 = new S2i3ConstructorWithParameter(4);
		S2i3ConstructorWithParameter v3 = new S2i3ConstructorWithParameter(5);
	}
}
