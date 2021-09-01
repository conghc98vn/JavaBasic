package j4OOP;

enum Size241 {
	SMALL, MEDIUM, LARGE, EXTRALARGE
}

public class S24i1EnumStringDemo {
	public static void main(String[] args) {
		System.out.println("string value of SMALL is " + Size241.SMALL.toString());
		System.out.println("string value of MEDIUM is " + Size241.MEDIUM.name());

	}
}
