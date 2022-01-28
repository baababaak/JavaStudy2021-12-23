package a11_배열;

public class ArrayMain {

	public static void main(String[] args) {
		User[] users = new User[5];

		users[0] = new User();
		users[1] = new User();
		users[2] = new User();
		users[3] = new User();
		users[4] = new User();
		
		for(User user : users) {
			user.setUsername("김준일");
			System.out.println(user.getUsername());
		}
		
		users[0].setUsername("김준일");
		users[0].getUsername();
		

	}

}
