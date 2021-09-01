package j2FlowControl;

import java.util.Scanner;

public class S5Break {
	public static void main(String[] args) {
		S5Break breakExample = new S5Break();
		breakExample.lableBreak1();
	}

	public void breakLoop() {
		// for loop
		for (int i = 1; i <= 10; ++i) {

			// if the value of i is 5 the loop terminates
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
	}

	public void breakLoop1() {
		Double number, sum = 0.0;

		// create an object of Scanner
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.print("Enter a number: ");

			// takes double input from user
			number = input.nextDouble();

			// if number is negative the loop terminates
			if (number < 0.0) {
				break;
			}

			sum += number;
		}
		System.out.println("Sum = " + sum);
	}

	public void lableBreak() {
		// the for loop is labeled as first
		first: for (int i = 1; i < 5; i++) {

			// the for loop is labeled as second
			second: for (int j = 1; j < 3; j++) {
				System.out.println("i = " + i + "; j = " + j);

				// the break statement breaks the first for loop
				if (i == 2)
					break first;
			}
		}
	}

	public void lableBreak1() {
		// the for loop is labeled as first
		first: for (int i = 1; i < 5; i++) {

			// the for loop is labeled as second
			second: for (int j = 1; j < 3; j++) {

				System.out.println("i = " + i + "; j = " + j);

				// the break statement terminates the loop labeled as second
				if (i == 2)
					break second;
			}
		}
	}
}
