package j4OOP;

import java.lang.Class;
import java.lang.reflect.*;

class Animal251 {
}

// put this class in different Dog.java file
class Dog251 extends Animal251 {
	public void display() {
		System.out.println("I am a dog.");
	}
}

public class S25i1ReflactionWithClass {
	public static void main(String[] args) {
		try {
			// create an object of Dog
			Dog251 d1 = new Dog251();

			// create an object of Class
			// using getClass()
			Class obj = d1.getClass();

			// get name of the class
			String name = obj.getName();
			System.out.println("Name: " + name);

			// get the access modifier of the class
			int modifier = obj.getModifiers();

			// convert the access modifier to string
			String mod = Modifier.toString(modifier);
			System.out.println("Modifier: " + mod);

			// get the superclass of Dog
			Class superClass = obj.getSuperclass();
			System.out.println("Superclass: " + superClass.getName());
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
