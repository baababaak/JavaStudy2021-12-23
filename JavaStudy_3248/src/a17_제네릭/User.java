package a17_제네릭;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
	private int userCode;
	private String username;
	private String password;
	private String name;
	private String email;
	private String provider;
	private String role;
	
	public boolean authError(String username, String password) {
		boolean flag = false;
		
		if(this.username == null && this.password == null) {
			System.out.println("정보를 입력해주세요.");
			flag = true;
		}else if(!this.username.equals(username) && !this.password.equals(password)) {
			System.out.println("로그인 실패");
			flag = true;
		}else {
			System.out.println();
		}
		return flag;
	}
}
