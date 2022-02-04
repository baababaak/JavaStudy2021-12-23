package a12_상속;

public class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("독수리가 날개를 펴고 하늘을 납니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 하늘 높이 날아 오릅니다.");
	}

}
