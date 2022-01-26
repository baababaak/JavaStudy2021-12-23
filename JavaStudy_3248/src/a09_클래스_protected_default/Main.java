package a09_클래스_protected_default;

public class Main {

	public static void main(String[] args) {
		Default default1 = new Default();
		default1.name = "박지현";
		default1.addr = "부산진구";
		default1.test();
		
		Public public1 = new Public();
		Private private1 = new Private();
		Student student = new Student();
		
	}

}
