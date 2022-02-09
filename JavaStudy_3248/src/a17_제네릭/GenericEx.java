package a17_제네릭;

public class GenericEx {
	/*
	 * 와일드 카드 <?>
	 * 어떤 타입이 들어올지 모름
	 */
	
	public Message<? extends User> printMessage(int code, User user) {
		if(code == 200) {
			System.out.println("전송성공");
			return new Message<User>(code, user);
		}else if(code == 302) {
			System.out.println("리다이렉트 성공");
			return new Message<User>(code, user);
		}else if(code == 400) {
			System.out.println("클라이언트 오류");
			return new Message<CompanyUser>(code, (CompanyUser)user);
		}
		return null;
	}
	
	public static void main(String[] args) {
		String username = "junil";
		String password = "1234";
		
		Message<String> msg1 = new Message<String>(200, "전송성공");
		System.out.println(msg1);
		
		User user1 = User.builder()
						.userCode(1)
						.username("junil")
						.password("1234")
						.name("김준일")
						.email("skjil1218@gmail.com")
						.provider("google")
						.role("ROLE_USER")
						.build();
		
		Message<User> msg2 = new Message<User>(400, user1);
		System.out.println(msg2);
		
		if(!msg2.getData().authError(username, password)) {
			System.out.println("로그인 성공");
		}
		
		Message<Integer> msg3 = new Message<Integer>(200, 100);
		System.out.println(msg3);
		
		User user2 = new CompanyUser("google", "부산 동래구");
		user2.setUsername("google");
		user2.setPassword("1111");
		
		GenericEx ex = new GenericEx();
		System.out.println(ex.printMessage(200, user1));
	}
	
}
