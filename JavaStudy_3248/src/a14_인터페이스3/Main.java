package a14_인터페이스3;

public class Main {

	public static void main(String[] args) {
		BoardService[] boardServices = new BoardService[2];
		
		boardServices[0] = new BoardServiceImpl();
		boardServices[1] =  new NoticeServiceImpl();
		
		for(BoardService boardService : boardServices) {
			boardService.insertBoard();
			boardService.getBoard();
			boardService.updateBoard();
			boardService.deleteBoard();
		}	
		
	}

}
