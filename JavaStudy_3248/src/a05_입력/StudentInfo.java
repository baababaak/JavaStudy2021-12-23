package a05_입력;

import java.util.Scanner;

public class StudentInfo {
	
	/**
	 * 문자열 변수
	 * name, schoolName, phoneNumber, address
	 * 정수형 변수
	 * studentYear, studentGroup, studentNumber
	 * 
	 * [학생정보 입력]
	 * 이름: 김준일
	 * 학교명: 부산고등학교
	 * 학년: 2
	 * 반: 1
	 * 번호: 10
	 * 전화번호: 010-0000-0000
	 * 주소: 부산광역시 부산진구 가야동
	 * 
	 * [학생정보 출력]
	 * 이름: 김준일
	 * 학교명: 부산고등학교
	 * 학년: 2
	 * 반: 1
	 * 번호: 10
	 * 전화번호: 010-0000-0000
	 * 주소: 부산광역시 부산진구 가야동
	 * 
	 */

	public static void main(String[] args) {
		String 
			name = null,
			schoolName = null,
			phoneNumber = null,
			address = null;
		
		int 
			studentYear = 0,
			studentGroup = 0,
			studentNumber = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[학생정보 입력]");
		System.out.print("이름: ");
		name = scanner.nextLine();
		System.out.print("학교명: ");
		schoolName = scanner.nextLine();
		System.out.print("학년: ");
		studentYear = scanner.nextInt();
		System.out.print("반: ");
		studentGroup = scanner.nextInt();
		System.out.print("번호: ");
		studentNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.print("전화번호: ");
		phoneNumber = scanner.nextLine();
		System.out.print("주소: ");
		address = scanner.nextLine();
		
		System.out.println("[학생정보 출력]");
		System.out.println("이름: " + name);
		System.out.println("학교명: " + schoolName);
		System.out.println("학년: " + studentYear);
		System.out.println("반: " + studentGroup );
		System.out.println("번호: " + studentNumber);
		System.out.println("전화번호: " + phoneNumber);
		System.out.println("주소: " + address);
		

	}

}
