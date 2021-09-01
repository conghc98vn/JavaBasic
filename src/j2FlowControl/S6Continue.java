package j2FlowControl;

import java.util.Scanner;

public class S6Continue {
	public static void main(String[] args) {
		S6Continue continueExample = new S6Continue();
		continueExample.continue1();
	}

	public void continue1() {// for loop
		for (int i = 1; i <= 10; ++i) {

			// if value of i is between 4 and 9, continue is executed
			if (i > 4 && i < 9) {
				continue;
			}
			System.out.println(i);
		}
	}

	public void continue2() {
		Double number, sum = 0.0;
		// create an object of Scanner
		Scanner input = new Scanner(System.in);

		for (int i = 1; i < 6; ++i) {
			System.out.print("Enter a number: ");
			// takes double type input from the user
			number = input.nextDouble();

			// if number is negative, the iteration is skipped
			if (number <= 0.0) {
				continue;
			}

			sum += number;
		}
		System.out.println("Sum = " + sum);
	}

	public void continueLable() {
		// the outer for loop is labeled as label
		first: for (int i = 1; i < 6; ++i) {
			for (int j = 1; j < 5; ++j) {
				if (i == 3 || j == 2)

					// skips the iteration of label (outer for loop)
					continue first;
				System.out.println("i = " + i + "; j = " + j);
			}
		}
	}
}
