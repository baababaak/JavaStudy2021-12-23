package a16_Lombok;

public class Main {

	public static void main(String[] args) {
		
		Product p1 = Product.builder()
					.product_code(1)
					.product_name("스타벅스 파랑 텀블러")
					.product_category("텀블러")
					.product_date("20220207")
					.build();
		
		Product p2 = Product.builder()
				.product_code(1)
				.product_name("스타벅스 파랑 텀블러")
				.product_category("텀블러")
				.product_date("20220207")
				.build();
		
		System.out.println(p1);
		
		System.out.println(p1.equals(p2));
	}

}
