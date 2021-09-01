package j4OOP;

enum Size242 {
	SMALL {

		// overriding toString() for SMALL
		public String toString() {
			return "The size is small.";
		}
	},

	MEDIUM {

		// overriding toString() for MEDIUM
		public String toString() {
			return "The size is medium.";
		}
	};
}

public class S24i2EnumStringWithOverride {
	public static void main(String[] args) {
		System.out.println(Size242.MEDIUM.toString());
	}
}
