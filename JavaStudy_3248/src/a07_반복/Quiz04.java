package a07_반복;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		// 별찍기
		Scanner scanner = new Scanner(System.in);
		int n = 0;
				
		System.out.print("반복횟수 입력: ");
		n = scanner.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < (i + 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 거꾸로 별찍기
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n - (i + 1); j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < (i + 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
