package a06_조건;

public class SwitchAndCase {

	public static void main(String[] args) {
		int round = 3;
		
		switch(round) {
			case 1 :
				System.out.println("1라운드");
				break;
			case 2 :
				System.out.println("2라운드");
			case 3 :
				System.out.println("3라운드");
			case 4 :
				System.out.println("4라운드");
			case 5 :
				System.out.println("5라운드");
			default :
				System.out.println("기본값입니다.");
		}

	}

}
