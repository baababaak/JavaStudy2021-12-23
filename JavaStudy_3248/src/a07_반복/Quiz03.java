package a07_반복;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		int count = 0;
		
		System.out.print("반복 횟수를 입력하세요: ");
		count = scanner.nextInt();
		
		// 기찍N
		while(i < count) {
			System.out.println(count - i);
			i++;
		}

	}

}
