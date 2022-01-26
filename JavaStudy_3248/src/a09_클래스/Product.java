package a09_클래스;

public class Product {
	
	/*
	 * 변수
	 * 상품코드 productCode
	 * 상품명 productName
	 * 제조사 company
	 * 
	 */
	
	/*
	 * 메소드
	 * 상품정보출력(productInfo)
	 * 상품코드: p20220125_1
	 * 상품명: 텀블러
	 * 제조사: 스타벅스
	 * 
	 */
	
	String productCode;
	String productName;
	String company;
	
	public Product() {
		System.out.println("생성중?");
		System.out.println(this);
	}
	
	public Product(String productCode, String productName, String company) {
		this.productCode = productCode;
		this.productName = productName;
		this.company = company;		
	}
	
	void productInfo() {
		System.out.println("상품코드: " + productCode);
		System.out.println("상품명: " + productName);
		System.out.println("제조사: " + company);
	}
	

}
