package a21_예외;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
class Person {
	private String name;
	
	public void loop(int[] numbers, List<Person> persons) throws IOException, ArrayIndexOutOfBoundsException, CustomException, NullPointerException{
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		if(1 ==1) {
			throw new CustomException("예외를 강제로 호출합니다.");
		}
					
		for(Person p : persons) {
			System.out.println(p.getName());
		}
	}
}

public class ExceptionEx {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5};
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("김준일"));
		persons.add(new Person("김준일"));
		persons.add(null);
		persons.add(new Person("김준일"));
		persons.add(new Person("김준일"));
		
		try {
			persons.get(1).loop(numbers, persons);
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		System.out.println("프로그램 종료");

	}

}
