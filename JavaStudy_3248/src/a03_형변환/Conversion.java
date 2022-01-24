package a03_형변환;

public class Conversion {

	public static void main(String[] args) {
		char c = 'a';
		int i_c = c; // char(문자) -> int(정수) 업캐스팅
		System.out.println(i_c);
		
		int i = 100;
		char c_i = (char)i; // int -> char 다운캐스팅
		System.out.println(c_i);
		
		double d = i; // int -> double 업캐스팅
		System.out.println(d);
		
		d = 3.14;
		int i_d = (int)d; // double -> int 다운캐스팅
		
		System.out.println(i_d);

	}

}
