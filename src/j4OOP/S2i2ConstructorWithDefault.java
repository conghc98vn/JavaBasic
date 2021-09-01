package j4OOP;

public class S2i2ConstructorWithDefault {

	int a;
	boolean b;

	public S2i2ConstructorWithDefault() { // Khai báo như này tương tự với việc không khai báo (có như không)
		a = 0;
        b = false;
	}
	
	public static void main(String[] args) {
		// call the constructor 
		S2i2ConstructorWithDefault obj = new S2i2ConstructorWithDefault();

        System.out.println("a = " + obj.a);
        System.out.println("b = " + obj.b);
	}
}
