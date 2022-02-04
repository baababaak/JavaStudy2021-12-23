package a14_인터페이스;

public class 거실스위치 implements Switch {
	
	@Override
	public void on() {
		System.out.println("거실 불을 켭니다.");
		
	}
	@Override
	public void off() {
		System.out.println("거실 불을 끕니다.");
		
	}
}
