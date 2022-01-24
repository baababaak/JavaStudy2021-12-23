package a06_조건;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두 수를 입력해주세요: ");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		
		if(num1 > num2) {
			System.out.println(">");
		}else if(num1 < num2) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}

	}

}
