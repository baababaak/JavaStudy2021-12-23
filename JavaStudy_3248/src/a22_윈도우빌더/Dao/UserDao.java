package a22_윈도우빌더.Dao;

import a22_윈도우빌더.Dto.UserEntity;

public interface UserDao {
	public int signinUser(String username, String password);
	public UserEntity getUserByUsername(String username);
}
