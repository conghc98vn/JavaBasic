package j4OOP;

//this is functional interface
@FunctionalInterface
interface MyInterface1 {

	// abstract method
	double getPiValue();
}

public class S6i1LambdaDemo1 {
	public static void main(String[] args) {
		MyInterface1 interface1 = () -> 3.14;
		System.out.println("Value of Pi = " + interface1.getPiValue());
	}
}
