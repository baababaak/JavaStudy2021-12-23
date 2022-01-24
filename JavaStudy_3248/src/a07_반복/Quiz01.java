package a07_반복;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int dan = 0; // 2 ~ 9단만 입력가능 != 2 ~ 9단만 출력가능합니다.
		int num = 0;
		
		System.out.print("출력하실 단수를 입력해주세요: ");
		dan = scanner.nextInt();
		
		if(dan < 2 || dan > 9) {
			System.out.println("2 ~ 9단만 출력가능합니다.");
		}else {
			while(num < 9) {
				System.out.println(dan + " x " + (++num) + " = " + (dan * num));
			}
			
		}
		
		
	}

}
