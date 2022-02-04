package a12_상속;

/**
 * 
 * 상속(Extends)
 * 상속을 받은 클래스(객체)는 부모의 모든 변수(속성), 메소드(기능)을 사용할 수 있다.
 * 부모클래스는 자식들클래스의 공통분모를 가지고 있어야 한다.
 *
 */

public class ExtendsEx {
	public static void main(String[] args) {
		// 업케스팅
		
		/*
		Human human = new Human();
		Animal animalHuman = human;
		animalHuman.move();
		Animal animalTiger = new Tiger();
		Animal animalEagle = new Eagle();
		*/
		
		Animal[] animals = new Animal[3];
		animals[0] = new Human();
		animals[1] = new Tiger();
		animals[2] = new Eagle();
		
		// 다운케스팅
		Human human2 = (Human)animals[0];
		human2.readBooks();
		
		// 안됨!
		// Tiger tiger = (Tiger)animalHuman;
		// tiger.hunting();
		
		// Animal animal = new Animal();
		// Eagle eagle = (Eagle)animal;
		
		for(Animal animal : animals) {
			animal.move();
		}
		
		System.out.println("========다운케스팅=========");
		
		for(Animal animal : animals) {
			if (animal instanceof Human) {
				Human h = (Human) animal;
				h.readBooks();
			}else if(animal instanceof Tiger) {
				Tiger t = (Tiger)animal;
				t.hunting();
			}else if(animal instanceof Eagle) {
				Eagle e = (Eagle)animal;
				e.flying();
			}
		}
	}

}
