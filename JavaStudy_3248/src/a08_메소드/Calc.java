package a08_메소드;

public class Calc {
	
	static int add(int a, int b) {
		return a+b;
	}
	
	static double add2(int a, double b) {
		double result = add(a, (int)b);
		return result;
	}

	public static void main(String[] args) {
		int result = add(10, 20);
		System.out.println(result);
		System.out.println(add2(10, 3.3));

	}

}
