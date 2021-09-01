package j2FlowControl;

import java.util.Scanner;

public class S1Switch {
	public static void main(String[] args) {
		S1Switch switchExample = new S1Switch();
//		switchExample.switchDay();
		switchExample.switchOperator();
	}

	public void switchDay() {
		int week = 4;
		String day;

		// switch statement to check day
		switch (week) {
		case 1:
			day = "Sunday";
			break;
		case 2:
			day = "Monday";
			break;
		case 3:
			day = "Tuesday";
			break;

		// match the value of week
		case 4:
			day = "Wednesday";
			break;
		case 5:
			day = "Thursday";
			break;
		case 6:
			day = "Friday";
			break;
		case 7:
			day = "Saturday";
			break;
		default:
			day = "Invalid day";
			break;
		}
		System.out.println("The day is " + day);
	}

	public void switchOperator() {

		char operator;
		Double number1, number2, result;

		// create an object of Scanner class
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter operator (either +, -, * or /): ");

		// ask user to enter operator
		operator = scanner.next().charAt(0);
		System.out.print("Enter number1 and number2 respectively: ");

		// ask user to enter numbers
		number1 = scanner.nextDouble();
		number2 = scanner.nextDouble();

		switch (operator) {

		// performs addition between numbers
		case '+':
			result = number1 + number2;
			System.out.print(number1 + "+" + number2 + " = " + result);
			break;

		// performs subtraction between numbers
		case '-':
			result = number1 - number2;
			System.out.print(number1 + "-" + number2 + " = " + result);
			break;

		// performs multiplication between numbers
		case '*':
			result = number1 * number2;
			System.out.print(number1 + "*" + number2 + " = " + result);
			break;

		// performs division between numbers
		case '/':
			result = number1 / number2;
			System.out.print(number1 + "/" + number2 + " = " + result);
			break;

		default:
			System.out.println("Invalid operator!");
			break;
		}
	}
}
