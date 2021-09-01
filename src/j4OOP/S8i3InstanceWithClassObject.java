package j4OOP;

public class S8i3InstanceWithClassObject {
	public static void main(String[] args) {
		Dog2 d1 = new Dog2();
        Animal2 a1 = new Animal2();
        Cat c1 = new Cat();

        System.out.println("Is d1 an instance of the Object class: "+ (d1 instanceof Object));
        System.out.println("Is a1 an instance of the Object class: "+ (a1 instanceof Object));
   
        System.out.println("Is c1 an instance of the Object class: "+ (c1 instanceof Object));
	}
}

class Animal2 {
}

class Dog2 {
}

class Cat {
}