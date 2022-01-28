package a11_배열;

import java.util.Scanner;

public class UserMain {
	private Scanner scanner;
	
	public UserMain(Scanner scanner) {
		this.scanner = scanner;
	}
	
	public void showMainDisplay() {
		System.out.println("[회원정보 관리 프로그램]");
		System.out.println("1. 회원정보 입력");
		System.out.println("2. 회원정보 조회");
		System.out.println("3. 프로그램 종료");
		System.out.println("==========================");
	}
	
	public int inputSelect() {
		int select = 0;
		System.out.print("명령을 선택해 주세요: ");
		select = scanner.nextInt();
		scanner.nextLine();
		return select;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UserMain userMain = new UserMain(scanner);
		UserService userService = new UserService(scanner);
		
		userService.userSizeSetting();
		
		do {
			System.out.println();
			userMain.showMainDisplay();
		}while(userService.mainLoop(userMain.inputSelect()));
		
		/* 
		 * userMain.showMainDisplay();
		 * while(userService.mainLoop(userMain.inputSelect())) {
		 *  System.out.println();
			userMain.showMainDisplay();
		 * };
		 */
		
		System.out.println("프로그램 종료.");

	}

}
