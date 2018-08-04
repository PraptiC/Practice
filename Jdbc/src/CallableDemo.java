import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

public class CallableDemo {
	public static void main(String[] args) {
		Connection con=null;
		try {
		con= JdbcUtil.getConnection();
		CallableStatement stmt = con.prepareCall("{call getName(?,?)}");
		stmt.setInt(1,123);
		stmt.registerOutParameter(2,Types.VARCHAR);
		stmt.execute();
		System.out.println("Name: "+stmt.getString(2));
	}
	catch(Exception e) {e.printStackTrace();}
	finally {
		try {
			if(con!=null)
				con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
		

	}
}
