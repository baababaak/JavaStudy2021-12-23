package a04_연산자;

public class Operation02 {

	public static void main(String[] args) {
		// 조건연산
		int select = 3;
		
		String job = select == 1 ? "강사" :
			select == 2 ? "학생" :
				select == 3 ? "멘토" :
					"지원하지 않는 직업입니다.";
		System.out.println(job);
		
		/*
		 * 정수형 변수 score 선언 = 점수
		 * 문자열 자료형 변수 grade 선언 = "A학점", "B학점" A ~ F
		 * 
		 * 1. score 점수가 0미만 이거나 100 초과이면 "잘못된 점수입니다." 출력
		 * 2. 90 ~ 100 점수면 A학점 출력
		 * 3. 80 ~ 89 점수면 B학점 출력
		 * 4. 70 ~ 79 점수면 C학점 출력
		 * 5. 60 ~ 69 점수면 D학점 출력
		 * 6. 0 ~ 59 점수면 F학점 출력
		 */
		
		int score = -80;
		String grade = score < 0 || score > 100 ? "잘못된 점수입니다.":
			score >= 90 ? "A학점" :
				score >= 80 ? "B학점" :
					score >=70 ? "C학점" :
						score >= 60 ? "D학점" : "F학점" ;
		System.out.println(grade);
						

	}

}
