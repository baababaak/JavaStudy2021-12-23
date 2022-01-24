package a06_조건;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		int quadrant = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두 수(좌표)를 입력하세요: ");
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		if(x == 0 && y == 0) {
			System.out.println("원점입니다.");
		}else {
			if(x > 0 && y > 0) {
				quadrant = 1;
			}else if(x < 0 && y > 0) {
				quadrant = 2;
			}else if(x < 0 && y < 0) {
				quadrant = 3;
			}else {
				quadrant = 4;
			}
		}
		
		System.out.println(quadrant + "사분면");

	}

}
