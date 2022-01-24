package a08_메소드;

public class MethodEx {
	
	static int main2() {
		System.out.println("메소드 호출?");
		return 1000;
	}
//	 void - 공허, 존재x => 리턴값이 없다

	public static void main(String[] args) {
		int num = main2();
		System.out.println("num: " + num);
		System.out.println("함수 바로 호출: " + main2());
	}

}
