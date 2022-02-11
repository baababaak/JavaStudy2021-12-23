package a19_스태틱;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Car {
	public static int carNumber;
	private String model;
	
	public static void show() {
		System.out.println("차량 일련번호: " + carNumber);
		System.out.println("스태틱 메소드 호출");
	}
	
}
