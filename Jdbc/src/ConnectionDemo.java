import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.OracleDriver";
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "training", "oracle");
			System.out.println("Connection Sucessful");
			
			DatabaseMetaData meta=con.getMetaData();
			System.out.println("DB Name: "+meta.getDatabaseProductName());
			System.out.println("DB Ver: "+meta.getDatabaseProductVersion());
			System.out.println("Driver Name: "+ meta.getDriverName());
			System.out.println("Driver Version: "+meta.getDriverVersion());
			
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				if (con != null)

					con.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}

	}

}
