package a22_윈도우빌더.Service;

import java.util.Map;

import a22_윈도우빌더.Dto.UserEntity;

public interface UserService {
	public Map<String, String> signin(String username, String password);
	public UserEntity getuser(String username);
}
