package a02_변수;

public class Conversion {

	public static void main(String[] args) {
		int num = 10;
		double number = num; // 업캐스팅(작은 단위 -> 큰 단위) - 묵시적 형 변환
		int age = (int)number; // 다운캐스팅(큰 단위 -> 작은 단위) - 명시적 형 변환
		
		System.out.println(age);
		
		// 업캐스팅
		// 1. 문자 -> 정수
		char c = 'A';
		int i_c = c; // 아스키코드값 출력
		System.out.println(i_c);
		
		int i = 10000000;
		char c_i = (char)i;
		System.out.println(c_i);
		
		// 정수 - 실수
		double i_d = i;
		System.out.println(i_d);
		
		double d = 3.14;
		int d_i = (int)d; // 소수 단위 잘려나감(데이터 손실)
		System.out.println(d_i);

	}

}
