package a06_조건;

public class IfElse {

	public static void main(String[] args) {
		int num = 70;
		
		if(num < 0 || num > 100) {
			System.out.println("올바른 점수가 아닙니다.");
		}else if(num >= 90) {
			System.out.println("90 ~ 100 사이입니다.");
		}else if(num >= 80) {
			System.out.println("80 ~ 90 사이입니다.");
		}else if(num >= 70) {
			System.out.println("70 ~ 80 사이입니다.");
		}else {
			System.out.println("0 ~ 79 사이입니다.");
		}
	
		
			
//		String result = num == 10 ? "num이 10입니다." : "num이 10이 아닙니다.";

	}

}
