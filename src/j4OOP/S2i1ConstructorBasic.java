package j4OOP;

public class S2i1ConstructorBasic {

	int x;

	private S2i1ConstructorBasic() {
		System.out.println("Constructor Called");
		x = 5;
	}

	public static void main(String[] args) {
		S2i1ConstructorBasic obj = new S2i1ConstructorBasic();
		System.out.println(obj.x);
	}
}
