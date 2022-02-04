package a14_인터페이스;

public class 주방스위치 implements Switch {

	@Override
	public void on() {
		System.out.println("주방 불을 켭니다.");
		
	}

	@Override
	public void off() {
		System.out.println("주방 불을 끕니다.");
		
	}

}
