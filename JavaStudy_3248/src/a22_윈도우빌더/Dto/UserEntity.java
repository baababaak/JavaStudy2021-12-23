package a22_윈도우빌더.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserEntity {
	private int user_code;
	private String username;
	private String password;
	private String name;
	private String email;
	private String user_phone;
	private String user_address;
}
