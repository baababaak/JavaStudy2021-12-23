package a15_Object;

/**
 * 
 * lombok 어노테이션
 * 
 */

@Builder
@NoArgsConstructor // 기본생성자
@AllArgsConstructor // 전체생성자
@Getter 
@Setter
@EqualsAndHashCode
@ToString
@Data // get, set, e, h, toString



public class User {
	private String username;
	private String pwd;

	
}
