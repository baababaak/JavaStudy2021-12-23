package a15_Object;

import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {
		String name1 = "김준일";
		String name2 = "김준일";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		String name3 = scanner.nextLine();
		String name4 = new String("김준일");
		
		System.out.println("name1 == name2 >> " + (name1 == name2));
		System.out.println("name1 == name3 >> " + (name1.equals(name3)));
		System.out.println("name1 == name4 >> " + (name1 == name4));

	}

}
