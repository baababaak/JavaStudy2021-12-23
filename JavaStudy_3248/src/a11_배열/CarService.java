package a11_배열;

import java.util.Scanner;

public class CarService {
	private Car[] cars;
	private Scanner scanner;
	
	public CarService(Scanner scanner) {
		this.scanner = scanner;
	}
	
	public boolean mainLoop(int select) {
		boolean flag = true;
		
		if(select == 1) {
			insertCarInfo();
		}else if(select == 2) {
			showCarInfo();
		}else if(select == 3) {
			System.out.println("프로그램 종료중..");
			return flag = false;
		}else {
			System.out.println("잘못된 명령입니다.");
		}
		return flag;
}
	
	public void userSizeSetting() {
		System.out.print("관리할 자동차 수를 입력하세요: ");
		cars = new Car[scanner.nextInt()];
	}
	
	public Car addCarInfo() {
		Car car = new Car();
		System.out.print("차량 번호: ");
		car.setCarNumber(scanner.nextLine());
		System.out.print("기종: ");
		car.setCarModel(scanner.nextLine());
		System.out.print("제조사: ");
		car.setCarCompany(scanner.nextLine());
		return car;
	}
	
	public void insertCarInfo() {
		System.out.println("[차량 정보 입력]");
		for(int i = 0; i < cars.length; i++) {
			System.out.println(i + 1 + "번째 차량 입력");
			cars[i] = addCarInfo();
			System.out.println();
		}
		System.out.println("입력이 완료되었습니다.");
	}
	
	public void showCarInfo() {
		System.out.println("[차량 정보 조회]");
		System.out.println("순번\t차량 번호\t\t기종\t\t제조사");
		for(int i = 0; i < cars.length; i++) {
			System.out.println(i + 1 + "\t" + cars[i].getCarNumber() + "\t" + cars[i].getCarModel() + "\t\t" + cars[i].getCarCompany());
		}
	}
}
