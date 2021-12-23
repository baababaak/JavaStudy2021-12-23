package a05_문자열;

public class StringEx {

	public static void main(String[] args) {
		int num = 1;
		char c = 'a';
		
		String name = "박지현";
		System.out.println("안녕하세요. " + name + " 입니다.");
		System.out.println(1 + 'a' + "안녕하세요" + 1 + 1); // 'a' 의 아스키 코드 값 - 97
		System.out.println(num + (c + "안녕하세요") + (1 + 1));
	}

}
