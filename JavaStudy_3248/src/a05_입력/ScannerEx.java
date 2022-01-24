package a05_입력;

import java.util.Scanner;

// import 단축기 -> Ctrl + Shift + O(영문)
// 자동완성 -> Ctrl + Space

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		 * < 숫자 입력 >
		System.out.print("첫번째 수를 입력해주세요: ");
		int num = scanner.nextInt();
		System.out.print("두번째 수를 입력해주세요: ");
		int num2 = scanner.nextInt();
		System.out.println(num);
		System.out.println(num2);
		*/
		
		System.out.print("이름: ");
		String name = scanner.nextLine();
		System.out.print("연락처: ");
		String phone = scanner.nextLine();
		System.out.print("주소: ");
		String addr = scanner.next();
		
		System.out.println("이름은 " + name + "이고 " + "연락처는 " + phone + "입니다.");
		System.out.println("주소는 " + addr + "입니다.");

	}

}
