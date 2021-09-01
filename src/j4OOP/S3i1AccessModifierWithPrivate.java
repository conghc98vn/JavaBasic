package j4OOP;

public class S3i1AccessModifierWithPrivate {
	public static void main(String[] args) {
		Data data = new Data();
//		data.name = "a"; // không gọi ra biến name được bởi vì nó là private
	}

}

class Data {
	private String name;

}