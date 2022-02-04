package a14_인터페이스2;

import java.util.Scanner;

public class Main {
	private Scanner scanner;
	private UserService userService;
	
	public Main(Scanner scanner, UserService userService) {
		this.scanner = scanner;
		this.userService = userService;
	}
	
	public void showMainMenu() {
		System.out.println("사용자 관리 프로그램");
		System.out.println("1: 사용자 추가");
		System.out.println("2: 사용자 조회");
		System.out.println("3: 사용자 수정");
		System.out.println("4: 사용자 삭제");
		System.out.println("0: 프로그램 종료");
		System.out.println();
	}
	
	public int inputSelect() {
		System.out.print("명령을 선택해주세요: ");
		int select = scanner.nextInt();
		scanner.nextLine();
		return select;
	}
	
	public boolean mainLogic(int select) {
		boolean flag = true;
		
		if(select == 1) {
			System.out.println("사용자 추가");
			userService.insertUser();
		}else if(select == 2) {
			System.out.println("사용자 조회");
			userService.getUser();
		}else if(select == 3) {
			System.out.println("사용자 수정");
			userService.updateUser();
		}else if(select == 4) {
			System.out.println("사용자 삭제");
			userService.delectUser();
		}else if(select == 0) {
			System.out.println("프로그램 종료중...");
			flag = false;
		}else {
			System.out.println("잘못된 명령입니다.");
		}
		
		return flag;
	}
	
	public void mainLoop() {
		showMainMenu();
		while(mainLogic(inputSelect())) {
			System.out.println();
			showMainMenu();
		}
		System.out.println("종료");
	}

	public static void main(String[] args) {
		UserService userService = new UserServiceImplV2();
		
		Main main = new Main(new Scanner(System.in), userService);
		main.mainLoop();

	}

}
