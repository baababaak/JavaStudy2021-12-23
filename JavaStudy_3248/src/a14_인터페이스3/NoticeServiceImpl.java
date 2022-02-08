package a14_인터페이스3;

public class NoticeServiceImpl implements BoardService {

	@Override
	public void insertBoard() {
		System.out.println("공지사항을 추가합니다.");
		
	}

	@Override
	public void getBoard() {
		System.out.println("공지사항을 조회합니다.");
		
	}

	@Override
	public void updateBoard() {
		System.out.println("공지사항을 수정합니다.");
		
	}

	@Override
	public void deleteBoard() {
		System.out.println("공지사항을 삭제합니다.");
		
	}

}
