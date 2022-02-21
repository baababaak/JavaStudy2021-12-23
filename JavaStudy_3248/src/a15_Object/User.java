package a15_Object;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * lombok 어노테이션
 * 
 *
 */

@Builder
@AllArgsConstructor // 기본생성자
@NoArgsConstructor // 전체생성자
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Data // get, set, e, h, toString
public class User {
	private String username;
	private String password;	
	private String name;
	private String email;
}
