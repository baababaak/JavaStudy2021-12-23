package a14_인터페이스2;

public interface UserService {
	/*
	 * CRUD
	 * C: create(생성)
	 * R: read(조회)
	 * U: update(수정)
	 * D: delete(삭제)
	 */
	public void insertUser();
	public void getUser();
	public void updateUser();
	public void delectUser();
}
