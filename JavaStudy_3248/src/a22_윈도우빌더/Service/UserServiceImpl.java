package a22_윈도우빌더.Service;

import java.util.HashMap;
import java.util.Map;

import a22_윈도우빌더.Dao.UserDao;
import a22_윈도우빌더.Dto.UserEntity;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public Map<String, String> signin(String username, String password) {
		int signinFlag = userDao.signinUser(username, password);
		
		Map<String, String> signinMessage = new HashMap<String, String>();
		signinMessage.put("code", Integer.toString(signinFlag));
		if(signinFlag == 0) {
			//아이디가 존재하지 않음
			signinMessage.put("msg", "존재하지 않는 아이디입니다.");
			signinMessage.put("title", "아이디 오류");
		}else if(signinFlag == 1) {
			//비밀번호가 틀림
			signinMessage.put("msg", "비밀번호가 틀렸습니다.");
			signinMessage.put("title", "비밀번호 오류");
		}else if(signinFlag == 2) {
			//로그인 성공
			signinMessage.put("msg", "로그인 성공! 환영합니다.");
			signinMessage.put("title", "로그인 성공");
		}else {
			//DB오류
			signinMessage.put("msg", "로그인 중 일시적 오류가 발생하였습니다.\n관리자에게 문의하세요.");
			signinMessage.put("title", "시스템 오류");
		}
		
		return signinMessage;
	}

	@Override
	public UserEntity getuser(String username) {
		return userDao.getUserByUsername(username);
	}

}
