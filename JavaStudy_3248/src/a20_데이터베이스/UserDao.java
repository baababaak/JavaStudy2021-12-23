package a20_데이터베이스;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import a20_데이터베이스.Dto.User;
import db.DBConnectionMgr;

public class UserDao {
	private DBConnectionMgr pool;
	
	public UserDao(DBConnectionMgr pool) {
		this.pool = pool;
	}
	
	public List<User> getUsers() {
		List<User> users = new ArrayList<User>();
		
		String sql = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = pool.getConnection(); // DBMS에 연결(튜브 빌려서 pool에 들어감)
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
					+ "	LEFT OUTER JOIN user_dtl ud ON(ud.user_code = um.user_code)";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(); // excuteQuery(쿼리 실행) 그 결과를 ResultSet에 담는다.
			
			while(rs.next()) {
				User user = User.builder()
								.user_code(rs.getInt(1))
								.username(rs.getString(2))
								.password(rs.getString(3))
								.name(rs.getString(4))
								.email(rs.getString(5))
								.user_phone(rs.getString(6))
								.user_address(rs.getString(7))
								.build();
				users.add(user);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		
		return users;
	}
	
	public int insertUser(User user) {
		String sql = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
				
		try {
			con = pool.getConnection();
			sql = "INSERT INTO\r\n"
					+ "	user_mst\r\n"
					+ "VALUES(\r\n"
					+ "	0,\r\n"
					+ "	?,\r\n"
					+ "	?,\r\n"
					+ "	?,\r\n"
					+ "	?,\r\n"
					+ "	NOW(),\r\n"
					+ "	NOW()\r\n"
					+ ")";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getName());
			pstmt.setString(4, user.getEmail());
			result = pstmt.executeUpdate(); // insert, upadate, delete
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		
		return result;
	}
	
	public int updatePassword(String username, String newPassword) {
		String sql = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			con = pool.getConnection();
			sql = "UPDATE\r\n"
					+ "	user_mst\r\n"
					+ "SET\r\n"
					+ "	PASSWORD = ?\r\n"
					+ "WHERE\r\n"
					+ "	username = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, newPassword);
			pstmt.setString(2, username);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		
		return result;
	}
	
	public int updatePhoneAndAddress(String username, String phone, String address) {
		String sql = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			con = pool.getConnection();
			sql = "UPDATE\r\n"
					+ "	user_dtl\r\n"
					+ "SET\r\n"
					+ "	user_phone = ?,\r\n"
					+ "	user_address = ?\r\n"
					+ "WHERE\r\n"
					+ "	user_code = (SELECT\r\n"
					+ "						user_code\r\n"
					+ "					from\r\n"
					+ "						user_mst\r\n"
					+ "					where\r\n"
					+ "						username = ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, phone);
			pstmt.setString(2, address);
			pstmt.setString(3, username);
			result = pstmt.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		
		return result;
	}
	
	public int deleteUser(String username) {
		String sql = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			con = pool.getConnection();
			sql = "DELETE\r\n"
					+ "FROM\r\n"
					+ "	user_mst\r\n"
					+ "WHERE\r\n"
					+ "	username = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, username);
			result = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		
		return result;
	}
	
	
}
