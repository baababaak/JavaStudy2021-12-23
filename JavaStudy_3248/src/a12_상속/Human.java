package a12_상속;

/*
 * @ - 어노테이션
 * this - 자기 자신의 주소를 의미
 * super - 부모의 주소를 의미
 */

public class Human extends Animal {
	
	public Human() {
		super();
	}
	
	@Override // 재정의
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}

}
