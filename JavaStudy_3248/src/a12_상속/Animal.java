package a12_상속;

public class Animal {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void move() {
		System.out.println(name + " 동물이 움직입니다.");
	}

}
