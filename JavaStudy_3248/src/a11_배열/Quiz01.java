package a11_배열;

/*
 * 
 * 자동차 관리 프로그램
 * Car
 * 변수
 * carNumber	-> 차량 번호(43다 1317)
 * carModel		-> K5
 * carCompany	-> KIA
 * 
 * CarService
 * 
 */

import java.util.Scanner;

public class Quiz01 {
	private Scanner scanner;
	
	public Quiz01(Scanner scanner) {
		this.scanner = scanner;
	}
	
	public void showCarDisplay() {
		System.out.println("[자동차 관리 프로그램]");
		System.out.println("1. 차량 정보 입력");
		System.out.println("2. 차량 정보 조회");
		System.out.println("3. 프로그램 종료");
	}
	
	public int inputSelect() {
		int select = 0;
		System.out.print("명령을 선택하세요: ");
		select = scanner.nextInt();
		scanner.nextLine();
		return select;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Quiz01 q1 = new Quiz01(scanner);
		CarService carService = new CarService(scanner);
		
		carService.userSizeSetting();
		
		do{
			q1.showCarDisplay();
			System.out.println();
		}
		while(carService.mainLoop(q1.inputSelect()));
		
		System.out.println("프로그램 종료.");
		

	}

}
