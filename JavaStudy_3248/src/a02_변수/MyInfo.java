package a02_변수;

public class MyInfo {

	public static void main(String[] args) {
		int studentYear = 2;
		double korAvg = 80; // double - 소수점 단위
		boolean maleFemale = true; // 남: true, 여: false
		// char - 문자 하나
		char name = '박'; // 문자 - 작은 따옴표(''), 문자열 - 쌍따옴표("")
		
		
		System.out.print(name);
		name = '지';
		System.out.print(name);
		name = '현';
		System.out.println(name);
		
		System.out.print("이름: ");
		System.out.println("박지현");
		System.out.print("학년: ");
		System.out.println(studentYear);
		System.out.println(korAvg);
		System.out.println(maleFemale);
		System.out.println();
		
		System.out.print("이름: ");
		System.out.println("박지현2");
		System.out.print("학년: ");
		System.out.println(studentYear);
		System.out.println();
		
		System.out.print("이름: ");
		System.out.println("박지현3");
		System.out.print("학년: ");
		System.out.println(studentYear);
		System.out.println();
		
		System.out.print("이름: ");
		System.out.println("박지현4");
		System.out.print("학년: ");
		System.out.println(studentYear);
		System.out.println();
	}

}
