package a09_클래스2;

import a09_클래스_protected_default.Default;
import a09_클래스_protected_default.Public;

public class Main {

	public static void main(String[] args) {
		Default default1 = new Default();
		Public public1 = new Public();
		Student student = new Student();
		
		User user1 = new User();
		String email = "junil@google.com";
		
		user1.setUsername(email);
		System.out.println(user1.getUsername());

	}

}
