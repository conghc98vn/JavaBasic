package j4OOP;

import java.lang.Class;
import java.lang.reflect.*;

class Dog253 {
	public String type;
}

public class S25i3RflectionWithVariable {
	public static void main(String[] args) {
		try {
			// create an object of Dog
			Dog253 d1 = new Dog253();

			// create an object of Class
			// using getClass()
			Class obj = d1.getClass();

			// access and set the type field
			Field field1 = obj.getField("type");
			field1.set(d1, "labrador");

			// get the value of the field type
			String typeValue = (String) field1.get(d1);
			System.out.println("Value: " + typeValue);

			// get the access modifier of the field type
			int mod = field1.getModifiers();

			// convert the modifier to String form
			String modifier1 = Modifier.toString(mod);
			System.out.println("Modifier: " + modifier1);
			System.out.println(" ");
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
