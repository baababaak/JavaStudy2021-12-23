package a05_입력;

import java.util.Scanner;

/**
 * 
 * num1, num2, num3, result
 * 첫번째 수 입력: ?
 * 두번째 수 입력: ?
 * 세번째 수 입력: ?
 * 
 * 세 수의 합은 [ ? ] 입니다.
 *
 */

public class CalcAdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 첫 줄에 변수 선언 한 번에
		/*
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		*/
		int result = 0;
		
		System.out.print("첫번째 수 입력: ");
		// num1 = scanner.nextInt();
		result += scanner.nextInt();
		System.out.print("두번째 수 입력: ");
		// num2 = scanner.nextInt();
		result += scanner.nextInt();
		System.out.print("세번째 수 입력: ");
		// num3 = scanner.nextInt();
		result += scanner.nextInt();
		
		// result = num1 + num2 + num3;
		System.out.print("세 수의 합은 [ " + result + " ] 입니다.");

	}

}
