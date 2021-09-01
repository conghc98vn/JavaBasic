package j1JavaIntroduce;

public class S3Variable {
	public static void main(String[] args) {
		System.out.println("Variable");

		S3Variable variableTest = new S3Variable();
		variableTest.booleanExample();
		variableTest.byteExample();
		variableTest.shortExample();
		variableTest.intExample();
		variableTest.longExample();
		variableTest.doubleExample();
		variableTest.floatExample();
		variableTest.charExample();
	}

	public void booleanExample() {
		boolean flag = true;
		System.out.println(flag);
	}

	public void byteExample() {
		byte range;
		range = 124;
		System.out.println(range);
	}

	public void shortExample() {
		short temperature;
		temperature = -200;
		System.out.println(temperature);
	}

	public void intExample() {
		int range = -4250000;
		System.out.println(range);
	}

	public void longExample() {
		long range = -42332200000L;
		System.out.println(range);
	}

	public void doubleExample() {
		double number = -42.3;
		System.out.println(number);
	}

	public void floatExample() {
		float number = -42.3f;
		System.out.println(number);
	}

	public void charExample() {
		char letter = '\u0051';
		System.out.println(letter);
	}

}
