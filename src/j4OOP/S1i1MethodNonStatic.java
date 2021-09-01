package j4OOP;

public class S1i1MethodNonStatic {
	public static void main(String[] args) {

		// create object of the Output class
		S1i1MethodNonStatic obj = new S1i1MethodNonStatic();
		System.out.println("About to encounter a method.");

		// calling myMethod() of Output class
		obj.myMethod();
		
		System.out.println("Method was executed successfully!");

	}
	
	public void myMethod() {
		System.out.println("Printing from inside myMethod().");
	}
}
