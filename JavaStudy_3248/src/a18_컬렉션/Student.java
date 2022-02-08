package a18_컬렉션;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
	private String name;
	private String schoolName;
	private String phoneNumber;
	
}
