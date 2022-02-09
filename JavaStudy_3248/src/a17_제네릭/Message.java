package a17_제네릭;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * 제네릭 -> 클래스를 생성할 때 해당 클래스 내부에 필요한 자료형을 선택할 수 있는 것
 *
 * 
 */

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
/*
public class Message<T extends User> {
	private int code;
	private T data;
	
}
*/

public class Message<T> {
	private int code;
	private T data;
	
}

