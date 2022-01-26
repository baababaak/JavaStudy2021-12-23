package a09_클래스;

public class Student {
	String name; // 이름
	int studentYear; // 학년
	int studentCode; // 학번
	
	public void showStudentInfo() {
		System.out.println("학생 이름: " + name );
		System.out.println("학년: " + studentYear );
		System.out.println("학번: " + studentCode );
	}

}
