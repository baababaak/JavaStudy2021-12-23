package a07_조건;

public class SwitchCase {

	public static void main(String[] args) {
		char select = 'G'; // 해당 케이스부터 쭉 실행됨
		
		switch(select) {
			case 'A':
				System.out.println("A");
				break;
			case 'B':
				System.out.println("B");
				break;
			case 'C':
				System.out.println("C");
				break;
			case 'D':
				System.out.println("D");
				break;
			case 'F':
				System.out.println("F");
				break;
			default: // else 역할
				System.out.println("잘못된 성적");
		}

	}

}

