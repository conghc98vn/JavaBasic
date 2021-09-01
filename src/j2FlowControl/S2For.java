package j2FlowControl;

public class S2For {
	public static void main(String[] args) {
		S2For forExample = new S2For();
		forExample.forBasic();
	}

	public void forBasic() {
		for (int i = 1; i <= 10; ++i) {
			System.out.println("Line " + i);
		}
	}

	public void forSum() {
		int sum = 0;

		for (int i = 1; i <= 1000; ++i) {
			sum += i; // sum = sum + i
		}
		System.out.println("Sum = " + sum);
	}

	public void forInfinite() {
		for (int i = 1; i <= 10; --i) {
			System.out.println("Hello");
		}
	}

}
