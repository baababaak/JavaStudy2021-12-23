package a20_데이터베이스;

import a20_데이터베이스.Dto.User;
import db.DBConnectionMgr;

/**
 * 
 * DAO, DTO란?
 *
 * DAO: DataBase Access Object -> 데이터 베이스에서 데이터들을 가져올 때 사용되어지는 로직을 담음.
 * DTO: Data Transfer Object -> 데이터의 한 행을 객체로 변환시키거나 객체를 데이터로 변환 시켜주는 역할.
 *
 */

public class DataBaseService {

	public static void main(String[] args) {
		UserDao dao = new UserDao(DBConnectionMgr.getInstance());
		
		User user = User.builder()
				.username("jjj")
				.password("1234")
				.name("김준일")
				.email("skjil1218@gmail.com")
				.build();
		
		//System.out.println(dao.insertUser(user));
		//System.out.println(dao.updatePassword("jjj", "55555555"));
		for(User user2 : dao.getUsers()) {
			System.out.println(user2);
		}
		
		//System.out.println(dao.updatePhoneAndAddress("jjj", "010-1234-1234", "부산 동래구"));
		System.out.println(dao.deleteUser("jjj"));

	}

}
