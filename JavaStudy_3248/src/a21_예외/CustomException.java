package a21_예외;

public class CustomException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public CustomException(String message) {
		super(message);
		System.out.println("여기서 예외 관련 문제들을 해결합니다.");
	}
	
}
