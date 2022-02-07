package a15_Object;

/**
 * 
 * Object Class: 최상위 클래스
 * 모든 클래스는 Object 클래스를 상속받고 있다.
 * 즉, 모든 클래스는 Object 클래스로 업캐스팅이 가능하다.
 * 그리고 모든 클래스는 Object 클래스의 메소드를 오버라이딩 할 수 있다.
 *
 */
public class ObjectEx {

	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println(obj);
		
		String str = new String();
		
		User user = new User("junil", "1234");
		System.out.println(user);
		
		User user2 = User.builder().username("junil").password("1234").build();
		System.out.println(user2);

	}

}
