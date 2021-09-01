package j1JavaIntroduce;

import java.util.Scanner;

public class S5InputOutput {
	public static void main(String[] args) {
		S5InputOutput inputOutput = new S5InputOutput();
		inputOutput.outputExample();
		inputOutput.outputVariable();
		inputOutput.outputVariableString();
		inputOutput.inputExample();
	}

	public void outputExample() {
		System.out.println("1. println ");
		System.out.println("2. println ");

		System.out.print("1. print ");
		System.out.print("2. print");
	}

	public void outputVariable() {
		Double number = -10.6;

		System.out.println(5);
		System.out.println(number);
	}

	public void outputVariableString() {
		Double number = -10.6;

		System.out.println("I am " + "awesome.");
		System.out.println("Number = " + number); // trình biên dịch tự động convert biến number từ Double thành String
	}

	public void inputExample() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Getting float input
		System.out.print("Enter float: ");
		float myFloat = input.nextFloat();
		System.out.println("Float entered = " + myFloat);

		// Getting double input
		System.out.print("Enter double: ");
		double myDouble = input.nextDouble();
		System.out.println("Double entered = " + myDouble);

		// Getting String input
		System.out.print("Enter text: ");
		String myString = input.next();
		System.out.println("Text entered = " + myString);
	}
}
