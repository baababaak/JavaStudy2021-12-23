package a22_윈도우빌더.Content;

import a22_윈도우빌더.Dao.UserDao;
import a22_윈도우빌더.Dao.UserDaoImpl;
import a22_윈도우빌더.Service.UserService;
import a22_윈도우빌더.Service.UserServiceImpl;
import db.DBConnectionMgr;
import lombok.Data;

@Data
public class UserBeans {
	private DBConnectionMgr pool;
	private UserDao userDao;
	private UserService userService;
	
	public UserBeans() {
		pool = DBConnectionMgr.getInstance();
		userDao = new UserDaoImpl(pool);
		userService = new UserServiceImpl(userDao);
	}
}
