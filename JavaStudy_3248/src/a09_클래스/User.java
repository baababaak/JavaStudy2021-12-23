package a09_클래스;

public class User {
	String username;
	String password;
	String name;
	String email;
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	void showProfile() {
		System.out.println("아이디: " + username);
		System.out.println("비밀번호: " + password);
		System.out.println("이름: " + name);
		System.out.println("이메일: " + email);
	}

}
