package a14_인터페이스2;

public class UserServiceImplV2 implements UserService {

	@Override
	public void insertUser() {
		System.out.println("회원가입");
		System.out.println("회원정보를 추가합니다.");
		
	}

	@Override
	public void getUser() {
		System.out.println("로그인");
		System.out.println("회원정보를 조회합니다.");
		
	}

	@Override
	public void updateUser() {
		System.out.println("프로필 수정 또는 비밀번호 변경");
		System.out.println("회원정보를 수정합니다.");
		
	}

	@Override
	public void delectUser() {
		System.out.println("회원탈퇴");
		System.out.println("회원정보를 삭제합니다.");
		
	}

}
