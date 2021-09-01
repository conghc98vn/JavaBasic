package j2FlowControl;

public class S3ForEach {
	public static void main(String[] args) {
		S3ForEach forEach = new S3ForEach();
		forEach.forEachTotalSum();
	}

	public void loopBasic() {
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

		for (int i = 0; i < vowels.length; ++i) {
			System.out.println(vowels[i]);
		}
	}

	// loop standand vs for each

	public void loopForech() {
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		// foreach loop
		for (char item : vowels) {
			System.out.println(item);
		}
	}

	public void forEachTotalSum() {
		int[] numbers = { 3, 4, 5, -5, 0, 12 };
		int sum = 0;

		for (int number : numbers) {
			sum += number;
		}

		System.out.println("Sum = " + sum);
	}
}
