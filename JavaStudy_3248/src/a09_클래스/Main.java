package a09_클래스;

public class Main {

	public static void main(String[] args) {
		int number = 0;
		String name = "박지현";
		
		User user1 = new User("jihyeon", "1234");
		user1.showProfile();
		System.out.println();
		
		User user2 = new User("abcd", "1111");
		user2.showProfile();
		

	}

}
