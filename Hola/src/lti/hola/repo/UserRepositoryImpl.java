/**
 * 
 */
package lti.hola.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import lti.hola.bean.ForgetBean;
import lti.hola.bean.LoginBean;
import lti.hola.bean.RegisterBean;

public class UserRepositoryImpl implements UserRepository {
	private Connection getConnection() throws SQLException {
		try {
			Context initContext = new InitialContext(); // get environment
			Context envContext = (Context) initContext.lookup("java:/comp/env"); // get component env: jndi names
			DataSource ds = (DataSource) envContext.lookup("jdbc/myoracle"); // get data source
			Connection conn = ds.getConnection();
			return conn;
		} catch (NamingException e) {
			e.printStackTrace();
			return null;
		}

	}

	//Called when user logs in: LoginBean
	@Override
	public RegisterBean authenticate(LoginBean login) {

		String sql = "select * from users where email=? and password=?";
		Connection conn = null;
		RegisterBean user = null;

		try {
			conn = getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, login.getEmail());
			stmt.setString(2, login.getPassword());
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				user = new RegisterBean();
				user.setName(rs.getString(2));
				user.setEmail(rs.getString(1));
				user.setPassword(rs.getString(3));
				user.setAge(rs.getInt(4));
				user.setGender(rs.getString(5));
				user.setCity(rs.getString(6));
				user.setMovie(rs.getString(7));
				user.setPhoto(rs.getString(8));
			}
			return user;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	//Checking validity of user: ForgetBean
	@Override
	public boolean validate(ForgetBean forget) {
		String sql = "select * from users where email=? and movie=?";
		Connection conn = null;

		try {
			conn = getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, forget.getEmail());
			stmt.setString(2, forget.getMovie());
			ResultSet rs = stmt.executeQuery();
			return true;
			//return rs.next();	//returns boolean value (true/false)
		} catch (SQLException e) {
			e.printStackTrace();
			return false;

		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	//Changing user password: LoginBean
	@Override
	public boolean changePassword(LoginBean login) {

		String sql = "update users set password=? where email=?";
		Connection conn = null;

		try {
			conn = getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, login.getPassword());
			stmt.setString(2, login.getEmail());
			stmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	//Saving user data : RegisterBean
	@Override
	public boolean persist(RegisterBean register) {

		String sql = "insert into users values(?,?,?,?,?,?,?,?)";
		Connection conn = null;

		try {
			conn = getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, register.getEmail());
			stmt.setString(2, register.getName());
			stmt.setString(3, register.getPassword());
			stmt.setInt(4, register.getAge());
			stmt.setString(5, register.getGender());
			stmt.setString(6, register.getCity());
			stmt.setString(7, register.getMovie());
			stmt.setString(8, register.getPhoto());
			stmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public RegisterBean displayDetails(LoginBean login) {
		
		String sql = "select * from users where email=? and password=?";
		Connection conn = null;
		RegisterBean user = null;
		//return null;
		
		try {
			conn = getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, login.getEmail());
			stmt.setString(2, login.getPassword());
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				user = new RegisterBean();
				user.setName(rs.getString(2));
				user.setEmail(rs.getString(1));
				user.setPassword(rs.getString(3));
				user.setAge(rs.getInt(4));
				user.setGender(rs.getString(5));
				user.setCity(rs.getString(6));
				user.setMovie(rs.getString(7));
				user.setPhoto(rs.getString(8));
			}
			return user;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		
	}

}
