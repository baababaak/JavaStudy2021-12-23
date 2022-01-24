package a08_메소드;

public class Quiz01 {
	
	//재귀함수
	static int sum(int n, int startNum, int resultNum) {
		if(n != 0) {
			resultNum += (startNum);
			return sum(--n, ++startNum, resultNum);
		}
		return resultNum;
	}
	
	public static void main(String[] args) {
		System.out.println(sum(10, 1, 0));

	}

}
