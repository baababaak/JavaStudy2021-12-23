package a08_메소드;

public class Overloading {
	
	static int add(int a, int b) {
		return a + b;
	}
	
	static double add(int a, double b) {
		return a + b;
	}
	
	static double add(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println(add(10, 5));
		System.out.println(add(10, 3.3));
		System.out.println(add(10.5, 3.3));

	}

}
