package j2FlowControl;

import java.util.Scanner;

public class S4While {
	public static void main(String[] args) {
		S4While whileExample = new S4While();
		whileExample.doWhile();
	}

	public void whileBasic() {
		int i = 1;

		while (i <= 10) {
			System.out.println("Line " + i);
			++i;
		}
	}

	public void whileBasic1() {
		int sum = 0, i = 100;

		while (i != 0) {
			sum += i; // sum = sum + i;
			--i;
		}
		System.out.println("Sum = " + sum);
	}

	public void doWhile() {
		Double number, sum = 0.0;
		// creates an object of Scanner class
		Scanner input = new Scanner(System.in);

		do {

			// takes input from the user
			System.out.print("Enter a number: ");
			number = input.nextDouble();
			sum += number;
		} while (number != 0.0); // test expression

		System.out.println("Sum = " + sum);
	}
}
