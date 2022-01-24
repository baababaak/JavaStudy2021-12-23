package a07_반복;

public class GuGuDanFor {

	public static void main(String[] args) {
		/*
		 *
		 * dan 정수형 변수 = 2
		 * 
		 * 반복문 for
		 * 
		 * dan + 문자열로 x +i + 문자열 = dan * i
		 */
		
//		int dan = 2;
		
		for(int i = 0; i < 8; i++) {
			System.out.println((i + 2) + "단");
			for(int j = 0; j < 9; j++) {
				System.out.println((i + 2) + " x " + (j + 1) + " = " + ((i + 2) * (j + 1)));
			}
//			dan++;
			System.out.println();
		}

	}

}
