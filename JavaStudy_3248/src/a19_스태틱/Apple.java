package a19_스태틱;

import lombok.Data;

/**
 * 
 * 싱글톤(유일한 객체를 생성해서 공유하는 것)
 * 
 *
 */

@Data
public class Apple {
	private static Apple instance;
	
	private int serialNumber = 20220000;
	
	private Apple() {
		System.out.println("딱 한 번만 생성!");
	}
	
	public Iphone createIphone(String model) {
		return new Iphone(serialNumber++, model);
	}
	
	public static Apple getInstance() {
		if(instance == null) {
			instance = new Apple();
		}
		return instance;
	}
}
