package a22_윈도우빌더.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import a22_윈도우빌더.Dto.UserEntity;
import db.DBConnectionMgr;

public class UserDaoImpl implements UserDao {
	
	private DBConnectionMgr pool;
	
	public UserDaoImpl(DBConnectionMgr pool) {
		this.pool = pool;
	}

	@Override
	public int signinUser(String username, String password) {
		String sql = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int signinFlag = 3;
		
		try {
			con = pool.getConnection();
			sql = "SELECT\r\n"
					+ "	count(um.username) + count(um2.password) AS signin_flag\r\n"
					+ "FROM\r\n"
					+ "	user_mst um\r\n"
					+ "	LEFT OUTER JOIN user_mst um2 ON(um2.user_code = um.user_code AND um2.password = ?)\r\n"
					+ "WHERE\r\n"
					+ "	um.username = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, password);
			pstmt.setString(2, username);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				signinFlag = rs.getInt(1);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		
		
		return signinFlag;
	}

	@Override
	public UserEntity getUserByUsername(String username) {
		String sql = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		UserEntity user = null;
		
		try {
			con = pool.getConnection();
			sql = "SELECT\r\n"
					+ "	um.user_code,\r\n"
					+ "	um.username,\r\n"
					+ "	um.password,\r\n"
					+ "	um.name,\r\n"
					+ "	um.email,\r\n"
					+ "	ud.user_phone,\r\n"
					+ "	ud.user_address\r\n"
					+ "FROM\r\n"
					+ "	user_mst um\r\n"
					+ "	LEFT OUTER JOIN user_dtl ud ON(ud.user_code = um.user_code)\r\n"
					+ "WHERE\r\n"
					+ "	um.username = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, username);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				user = UserEntity.builder()
								.user_code(rs.getInt(1))
								.username(rs.getString(2))
								.password(rs.getString(3))
								.name(rs.getString(4))
								.email(rs.getString(5))
								.user_phone(rs.getString(6))
								.user_address(rs.getString(7))
								.build();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		
		
		return null;
	}

}
