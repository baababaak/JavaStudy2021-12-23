package a11_배열;

import java.util.Scanner;

public class UserService {
	private User[] users;
	private Scanner scanner;
	
	public UserService(Scanner scanner) {
		this.scanner = scanner;
	}
	
	public boolean mainLoop(int select) {
		boolean flag = true;
		
		if(select == 1) {
			insertUser();
		}else if(select == 2) {
			showUsers();
		}else if(select == 3) {
			System.out.println("프로그램 종료중...");
			flag = false;
		}else {
			System.out.println("잘못된 명령입니다.");
		}
		
		return flag;
	}
	
	public void userSizeSetting() {
		System.out.print("프로그램에서 관리할 회원의 최대 인원수를 입력하세요: ");
		users = new User[scanner.nextInt()];
	}
	
	public User addUser() {
		User user = new User();
		System.out.print("아이디: ");
		user.setUsername(scanner.nextLine());
		System.out.print("비밀번호: ");
		user.setPassword(scanner.nextLine());
		return user;
	}
	
	public void insertUser() {
		System.out.print("[회원 정보 입력]");
		for(int i = 0; i < users.length; i++) {
			System.out.println((i + 1) + "번째 회원 입력");
			users[i] = addUser();
			System.out.println();
		}
		System.out.println("회원정보 입력이 완료되었습니다.");
	}
	
	public void showUsers() {
		System.out.println("[회원 정보 조회]");
		System.out.println("순번\t아이디\t\t비밀번호");
		for(int i = 0; i < users.length; i++) {
			System.out.println((i + 1) + "\t" + users[i].getUsername() + "\t\t" + users[i].getPassword());
		}
		
	}
}
