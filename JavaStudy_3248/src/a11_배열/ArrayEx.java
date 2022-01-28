package a11_배열;

/**
 * 
 * 배열(Array)
 * 같은 자료형을 하나로 묶어서 관리하는 객체
 * index, index 연산기호 -> [index]
 *
 */

public class ArrayEx {

	public static void main(String[] args) {
		String[] name = new String[5];
		name[0] = "김준일";
		name[1] = "김준이";
		name[2] = "김준삼";
		name[3] = "김준사";
		name[4] = "김준오";
		for(int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		
		System.out.println();
		
		String[] name2 = {"김준일", "김준이", "김준삼"};
		for(int i = 0; i < name2.length; i++) {
			System.out.println(name2[i]);
		}

	}

}
