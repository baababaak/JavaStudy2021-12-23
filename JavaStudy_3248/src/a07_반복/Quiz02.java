package a07_반복;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		int count = 0;
		
		System.out.print("반복 횟수를 입력하세요: ");
		count = scanner.nextInt();
		
		while(i < count) {
//			int i = 0; 지역변수로 쓸 수 없음
			System.out.println(++i);
		}

	}

}
