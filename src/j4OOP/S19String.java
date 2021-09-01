package j4OOP;

public class S19String {
	public static void main(String[] args) {
		S19String.stringBasic();
	}

	public static void stringBasic() {
		// create 3 strings
		String first = "java programming";
		String second = "java programming";
		String third = "python programming";

		// compare first and second strings
		boolean result1 = first.equals(second);
		System.out.println("Strings first and second are equal: " + result1);

		// compare first and third strings
		boolean result2 = first.equals(third);
		System.out.println("Strings first and third are equal: " + result2);
	}

	public static void createWithNew() {
		// create a string using new
		String name = new String("Java String");

		System.out.println(name); // print Java String
	}

	public static void getLengthDemo() {
		// create a string
		String greet = "Hello! World";
		System.out.println("String: " + greet);

		// get the length of greet
		int length = greet.length();
		System.out.println("Length: " + length);
	}

	public static void concatDemo() {
		// create first string
		String first = "Java ";
		System.out.println("First String: " + first);

		// create second
		String second = "Programming";
		System.out.println("Second String: " + second);

		// join two strings
		String joinedString = first.concat(second);
		System.out.println("Joined String: " + joinedString);
	}

	public static void equalsDemo() {
		// create 3 strings
		String first = "java programming";
		String second = "java programming";
		String third = "python programming";

		// compare first and second strings
		boolean result1 = first.equals(second);
		System.out.println("Strings first and second are equal: " + result1);

		// compare first and third strings
		boolean result2 = first.equals(third);
		System.out.println("Strings first and third are equal: " + result2);
	}

	public static void replaceDemo() {
		String S1 = new String("the quick fox jumped");
		System.out.println("Original String is ': " + S1);
		System.out.println("String after replacing 'fox' with 'dog': " + S1.replace("fox", "dog"));
		System.out.println("String after replacing all 't' with 'a': " + S1.replace('t', 'a'));
	}

	public static void chartAtDemo() {
		String str = "Welcome to string handling tutorial";
		// This will return the first char of the string
		char ch1 = str.charAt(0);

		// This will return the 6th char of the string
		char ch2 = str.charAt(5);

		// This will return the 12th char of the string
		char ch3 = str.charAt(11);

		// This will return the 21st char of the string
		char ch4 = str.charAt(20);

		System.out.println("Character at 0 index is: " + ch1);
		System.out.println("Character at 5th index is: " + ch2);
		System.out.println("Character at 11th index is: " + ch3);
		System.out.println("Character at 20th index is: " + ch4);
	}

	public static void indexOfDemo() {
		String str1 = new String("This is a BeginnersBook tutorial");
		String str2 = new String("Beginners");
		String str3 = new String("Book");
		String str4 = new String("Books");
		System.out.println("Index of B in str1: " + str1.indexOf('B'));
		System.out.println("Index of B in str1 after 15th char:" + str1.indexOf('B', 15));
		System.out.println("Index of B in str1 after 30th char:" + str1.indexOf('B', 30));
		System.out.println("Index of string str2 in str1:" + str1.indexOf(str2));
		System.out.println("Index of str2 after 15th char" + str1.indexOf(str2, 15));
		System.out.println("Index of string str3:" + str1.indexOf(str3));
		System.out.println("Index of string str4" + str1.indexOf(str4));
		System.out.println("Index of hardcoded string:" + str1.indexOf("is"));
		System.out.println("Index of hardcoded string after 4th char:" + str1.indexOf("is", 4));
	}

	public static void CompareToDemo() {
		String str1 = "String method tutorial";
		String str2 = "compareTo method example";
		String str3 = "String method tutorial";

		int var1 = str1.compareTo(str2);
		System.out.println("str1 & str2 comparison: " + var1);

		int var2 = str1.compareTo(str3);
		System.out.println("str1 & str3 comparison: " + var2);

		int var3 = str2.compareTo("compareTo method example");
		System.out.println("str2 & string argument comparison: " + var3);
	}

	public static void trimDemo() {
		// trims the trailing and leading spaces
		String s = " geeks for geeks has all java functions to read  ";
		System.out.println(s.trim());

		// trims the leading spaces
		s = " Chetna loves reading books";
		System.out.println(s.trim());
	}

	public static void splitDemo() {
		String strMain = "Alpha, Beta, Delta, Gamma, Sigma";
		String[] arrSplit = strMain.split(", ");
		for (int i = 0; i < arrSplit.length; i++) {
			System.out.println(arrSplit[i]);
		}
	}

	public static void toLowerCaseDemo() {
		String s1 = "JAVATPOINT HELLO stRIng";
		String s1lower = s1.toLowerCase();
		System.out.println(s1lower);
	}

	public static void toUpCaseDemo() {
		String s1 = "hello string";
		String s1upper = s1.toUpperCase();
		System.out.println(s1upper);
	}

}
