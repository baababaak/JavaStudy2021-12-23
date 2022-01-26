package a09_클래스2;

/**
 * 
 * 접근지정자
 * default: 생략하면 default -> 동일 패키지 안에서만 접근이 가능
 * public(공개): 모든 위치에서 접근이 가능하다(접근 제한이 없음)
 * private(비공개): 동일 클래스 안에서만 접근이 가능
 * protected(상속): 동일 패키지 또는 다른 패키지에서 상속을 했을 경우 접근이 가능
 *
 */

public class User {
	private String username;
	private String password;
	
	public String getUsername()	{
		return username + "@google.com";
	}
	public void setUsername(String username) {
		int index = username.lastIndexOf("@");
		this.username = username.substring(0, index); // 아이디만 넣기
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
