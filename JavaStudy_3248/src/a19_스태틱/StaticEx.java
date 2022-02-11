package a19_스태틱;

/**
 * 
 * 스태틱(변수, 메소드) -> 해당 클래스에서 모든 객체가 공유하는 데이터 또는 메소드
 *
 */

public class StaticEx {

	public static void main(String[] args) {
		Car.carNumber = 10;
		Car.show();
		
		Car c1 = new Car();
		Car c2 = new Car();
		
		c1.carNumber += 100;
		c1.show();
		
		c2.carNumber += 200;
		c2.show();
		
		System.out.println();
		
		String sNumber = "100";
		int num = Integer.parseInt(sNumber); // 정수로 변환
		Double.parseDouble(sNumber); // 실수로 변환
		Boolean.parseBoolean("true");
		
		String str = Integer.toString(num); // 문자열로 변환
		/*
		 * Double.toString(num);
		 * Boolean.toString(false);
		 */
		
		System.out.println(++num);
	}

}
