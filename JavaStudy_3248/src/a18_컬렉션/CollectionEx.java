package a18_컬렉션;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionEx {
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		intList.add(100);
		intList.add(200);
		intList.add(300);
		intList.add(400);
		intList.add(500);
		intList.add(600);
		intList.add(700);
		intList.add(800);
		for(int i = 0; i < intList.size(); i++) {
			System.out.println(intList.get(i));
		}
		System.out.println();
		
		for(int number : intList) {
			System.out.println(intList);
		}
		System.out.println("index5: " + intList.get(5));
		
		intList.remove(3);
		System.out.println(intList);
		
		Set<String> strSet = new HashSet<String>();
		strSet.add("자바");
		strSet.add("HTML");
		strSet.add("CSS");
		strSet.add("Javascript");
		strSet.add("자바");
		
		String searchStr = "자바";
		
		Iterator<String> ir = strSet.iterator();
		while(ir.hasNext()) {
			String value = ir.next();
			
			if(value.equals(searchStr)) {
				System.out.println(value);
			}
		}
		
		System.out.println(strSet);
		
		HashMap<Integer, Student> studentMap = new HashMap<Integer, Student>();
		studentMap.put(20220001, new Student("김준일1", "부산고등학교", "010-9988-1916"));
		studentMap.put(20220002, new Student("김준일2", "부산고등학교", "010-9988-1916"));
		studentMap.put(20220003, new Student("김준일3", "부산고등학교", "010-9988-1916"));
		studentMap.put(20220004, new Student("김준일4", "부산고등학교", "010-9988-1916"));
		System.out.println(studentMap);
		System.out.println(studentMap.get(20220003));
		
		System.out.println();
		
		Set<Integer> set = studentMap.keySet();
		Iterator<Integer> ir2 = set.iterator();
		while(ir2.hasNext()) {
			System.out.println(studentMap.get(ir2.next()).getName());
		}
	}

}
