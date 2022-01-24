package a04_연산자;

public class Operation01 {

	public static void main(String[] args) {
		// 대입연산
		boolean trueAndFalse = true;
		trueAndFalse = false;
		System.out.println("boolean: " + trueAndFalse);
		
		char character = 'a';
		System.out.println("character: " + character);
		
		int integer = 100;
		System.out.println("integer: " + integer);
		
		double doubleNum = 153.3325;
		System.out.println("double: " + doubleNum);
		
		// 산술연산
		System.out.println("integer + 50 = " + (integer + 50)); // 합
		System.out.println("integer - 10 = " + (integer - 10)); // 차
		int result = integer * 5; // 곱
		System.out.println("integer x 5 = " + result);
		System.out.println("result / 2 = " + (result / 2)); // 몫
		System.out.println("result % 2 = " + (result % 2)); // 나머지
		
		// 증감연산(무조건 1을 증가시키거나 감소시킨다.)
		int number = 80;
		System.out.println(number);
		//number++; -> number = number + 1;
		System.out.println(number--); // 후증가(감소): 다음부터 증가(감소)를 시키겠다
		System.out.println(number);
		
		boolean booleanResult = 10 < 100;
		System.out.println(booleanResult);
		
		/*
		 * 논리 연산자
		 * true(1), false(0)
		 * 
		 * AND(곱) && -> 모든 값이 true여야 true의 결과가 나온다.
		 * -> true && true => true
		 * -> true && false => false
		 * -> false && true => false
		 * -> false && false => false
		 * 
		 * OR(합) || -> 모든 값이 false여야 false의 결과가 나온다.
		 * -> true || true => true
		 * -> true || false => true
		 * -> false || true => true
		 * -> false || false => false
		 * 
		 * NOT(부정) !
		 * !true => false
		 * !false => true
		 */
		
		int score = 0;
		boolean scoreResult = score >= 80 && score < 90;
		System.out.println(scoreResult);
		System.out.println(score != 0);
		
		// 복합대입 연산자 -> 자기 자신에게 연산처리를 한 결과를 대입할 때 사용.
		score = score + 100;
		score += 100;
		score -= 50;
		score %= 2; // score = score % 2;
		
		score = 80;
		
		scoreResult = score >= 80 && score < 90 ? false : true;
		System.out.println("scoreResult: " + scoreResult);

	}

}
