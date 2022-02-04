package a14_인터페이스2;

public class UserServiceImplV1 implements UserService {

	@Override
	public void insertUser() {
		System.out.println("사용자를 추가합니다.");
		
	}

	@Override
	public void getUser() {
		System.out.println("사용자 정보를 가져옵니다.");
		
	}

	@Override
	public void updateUser() {
		System.out.println("사용자 정보를 수정합니다.");
		
	}

	@Override
	public void delectUser() {
		System.out.println("사용자 정보를 삭제합니다.");
		
	}

}
