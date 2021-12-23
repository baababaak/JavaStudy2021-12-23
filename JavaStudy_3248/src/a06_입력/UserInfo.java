package a06_입력;

import java.util.Scanner;

/**
 * 
 * 사용자의 이름을 입력해 주세요 : 박지현 -> 문자열
 * 사용자의 아이디를 입력해 주세요 : jihyeon -> 문자열
 * 사용자의 비밀번호를 입력해 주세요 : 1234 -> 정수
 * 사용자의 이메일을 입력해 주세요 : pjh4794@naver.com -> 문자열
 * 
 * [입력한 사용자의 정보]
 * 이름 : 박지현
 * 아이디 : jihyeon
 * 비밀번호 : 1234
 * 이메일 : pjh4794@naver.com
 */

public class UserInfo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name;
		String id;
		int password;
		String email;
		
		System.out.print("사용자의 이름을 입력해 주세요: ");
		name = in.nextLine(); // nextLine() - buffer 안 씀
		System.out.print("사용자의 아이디를 입력해 주세요: ");
		id = in.nextLine();
		System.out.print("사용자의 비밀번호를 입력해 주세요: ");
		password = in.nextInt();
		in.nextLine(); // flush
		System.out.print("사용자의 이메일을 입력해 주세요: ");
		email = in.nextLine();
		
		
		System.out.println("\n[입력한 사용자의 정보]");
		System.out.println("이름 : " + name);
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + password);
		System.out.println("이메일 : " + email);
	}

}
