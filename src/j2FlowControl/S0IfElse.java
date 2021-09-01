package j2FlowControl;

import java.util.Scanner;

public class S0IfElse {
	public static void main(String[] args) {
		S0IfElse ifElse = new S0IfElse();
		ifElse.IfStatement();
	}

	public void IfStatement() {
		int number = 10;

		// checks if number is greater than 0
		if (number > 0) {
			System.out.println("The number is positive.");
		}
		System.out.println("This statement is always executed.");
	}

	public void IfElse() {
		int number = 10;

		// checks if number is greater than 0
		if (number > 0) {
			System.out.println("The number is positive."); // số dương
		} else {
			System.out.println("The number is not positive.");
		}

		System.out.println("This statement is always executed.");
	}

	public void IfElseIf() {
		int number = 0;

		// checks if number is greater than 0
		if (number > 0) {
			System.out.println("The number is positive."); // số dương
		}
		// checks if number is less than 0
		else if (number < 0) {
			System.out.println("The number is negative."); // số âm
		} else {
			System.out.println("The number is 0.");
		}
	}

	public void largestNumber() {
		// declaring double type variables
		Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largestNumber;

		// checks if n1 is greater than or equal to n2
		if (n1 >= n2) {

			// if...else statement inside the if block
			// checks if n1 is greater than or equal to n3
			if (n1 >= n3) {
				largestNumber = n1;
			}

			else {
				largestNumber = n3;
			}
		} else {

			// if..else statement inside else block
			// checks if n2 is greater than or equal to n3
			if (n2 >= n3) {
				largestNumber = n2;
			}

			else {
				largestNumber = n3;
			}
		}

		System.out.println("The largest number is " + largestNumber);
	}

	public void findMaxValue() {
		int a, b, c, max;

		Scanner input = new Scanner(System.in);

		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();

		if (a > b && a > c) {
			max = a;
		} else if (b > a && b > c) {
			max = b;
		} else {
			max = c;
		}

		System.out.println(max);
	}
}
