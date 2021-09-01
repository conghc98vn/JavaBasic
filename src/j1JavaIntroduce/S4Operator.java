package j1JavaIntroduce;

public class S4Operator {

	public static void main(String[] args) {
		S4Operator operatorTest = new S4Operator();
		operatorTest.ArithmeticOperator();
		operatorTest.ArithmeticOperatorString();
		operatorTest.UnaryOperator();
		operatorTest.UnaryOperatorSpecial();
		operatorTest.RelationalOperator();
		operatorTest.instanceOfOperator();
		operatorTest.LogicalOperator();
		operatorTest.ConditionalOperator();
	}

	public void ArithmeticOperator() { // Toán tử số học
		double number1 = 12.5, number2 = 3.5, result;

		// Using addition operator
		result = number1 + number2;
		System.out.println("number1 + number2 = " + result);

		// Using subtraction operator
		result = number1 - number2;
		System.out.println("number1 - number2 = " + result);

		// Using multiplication operator
		result = number1 * number2;
		System.out.println("number1 * number2 = " + result);

		// Using division operator
		result = number1 / number2;
		System.out.println("number1 / number2 = " + result);

		// Using remainder operator
		result = number1 % number2;
		System.out.println("number1 % number2 = " + result);
	}

	public void ArithmeticOperatorString() { // Toán tử số học, nối chuỗi
		String start, middle, end, result;

		start = "Talk is cheap. ";
		middle = "Show me the code. ";
		end = "- Linus Torvalds";

		result = start + middle + end;
		System.out.println(result);
	}

	public void UnaryOperator() { // Toán tử một ngôi
		double number = 5.2;
		boolean flag = false;

		System.out.println("+number = " + +number);
		// number is equal to 5.2 here.

		System.out.println("-number = " + -number);
		// number is equal to 5.2 here.

		// ++number is equivalent to number = number + 1
		System.out.println("number = " + ++number);
		// number is equal to 6.2 here.

		// -- number is equivalent to number = number - 1
		System.out.println("number = " + --number);
		// number is equal to 5.2 here.

		System.out.println("!flag = " + !flag);
		// flag is still false.
	}

	public void UnaryOperatorSpecial() {
		double number = 5.2;

		System.out.println(number++); // Giá trị ban đầu tính trước xong mới cộng => show ra xong mới cộng
		System.out.println(number);

		System.out.println(++number); // Giá trị cộng trước xong mới show ra màn hình
		System.out.println(number);
	}

	public void RelationalOperator() { // Toán tử quan hệ
		int number1 = 5, number2 = 6;

		if (number1 > number2) {
			System.out.println("number1 is greater than number2.");
		} else {
			System.out.println("number2 is greater than number1.");
		}
	}

	public void instanceOfOperator() { // Toán tử instanceof
		String test = "asdf";
		boolean result;

		result = test instanceof String;
		System.out.println(result);
	}

	public void LogicalOperator() {
		int number1 = 1, number2 = 2, number3 = 9;
		boolean result;

		// At least one expression needs to be true for result to be true
		result = (number1 > number2) || (number3 > number1);
		// result will be true because (number1 > number2) is true
		System.out.println(result);

		// All expression must be true from result to be true
		result = (number1 > number2) && (number3 > number1);
		// result will be false because (number3 > number1) is false
		System.out.println(result);
	}

	public void ConditionalOperator() {
		int februaryDays = 29;
		String result;

		result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
		System.out.println(result);
	}
}
