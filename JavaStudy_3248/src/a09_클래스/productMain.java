package a09_클래스;

public class productMain {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product("p20220125_2", "머그컵", "스타벅스");
		
		p2.productInfo();
		
		System.out.println("p1: " + p1);
		System.out.println("p2: " + p2);
		
		p1.productCode = "p20220125_1";
		p1.productName = "텀블러";
		p1.company = "스타벅스";
		
		p1.productInfo();
		
		Product p3 = null;
		// null: 주소가 0번지임을 가르킨다.

	}

}
