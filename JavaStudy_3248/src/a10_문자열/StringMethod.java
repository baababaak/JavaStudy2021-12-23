package a10_문자열;

public class StringMethod {

	public static void main(String[] args) {
		String email = "junil12333333@google.com";
		int tokenIndex = email.lastIndexOf("@");
		String username = email.substring(0, tokenIndex);
		String providerAddress = email.substring(tokenIndex + 1);
		
		System.out.println("이메일: " + email);
		System.out.println("아이디: " + username);
		System.out.println("웹주소: " + providerAddress);

	}

}
