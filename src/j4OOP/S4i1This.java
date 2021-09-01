package j4OOP;

public class S4i1This {
	int instVar;

	public S4i1This(int instVar) {
		this.instVar = instVar;
		System.out.println("this reference = " + this);
	}

	public static void main(String[] args) {
		S4i1This obj = new S4i1This(8);
		System.out.println("object reference = " + obj);
	}
}
