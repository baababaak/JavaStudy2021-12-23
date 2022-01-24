package a07_반복;

public class For {

	public static void main(String[] args) {		
		int count = 5;
		
		for(int i = 0, j = 0; i < count && i != 5; i++, j++) { // for문 안에서만 쓰는 i
			System.out.println(i);
			System.out.println(j);
		}

	}

}
