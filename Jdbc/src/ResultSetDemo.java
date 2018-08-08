
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ResultSetDemo {
	public static void main(String[] args) {
		Connection con = null;
		String sql = "Select deptno,dname from dept";

		try {
			con = JdbcUtil.getConnection();
			ResultSet rs = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE).executeQuery(sql);
			ResultSetMetaData meta = rs.getMetaData();
			for(int c=1;c<=meta.getColumnCount();c++)
				System.out.print(meta.getColumnName(c)+"\t");
			System.out.println();
			
			while (rs.next())
				System.out.printf("%5d\t%-15s\n",rs.getInt(1),rs.getString("dname"));
			
			rs.absolute(3); // moves the cursor to the fifth row of rs
		       rs.updateString("DNAME", "MARKETING"); // updates the
		          // NAME column of row 5 to be AINSWORTH
		       rs.updateRow(); // updates the row in the data source
		       
		       for(int c=1;c<=meta.getColumnCount();c++)
					System.out.print(meta.getColumnName(c)+"\t");
				System.out.println();
				rs.absolute(1);
		       while (rs.next())
					System.out.printf("%5d\t%-15s\n",rs.getInt(1),rs.getString("dname"));
		         
		   /*  rs.moveToInsertRow(); // moves cursor to the insert row
		       rs.updateInt(1, 80); // updates the
		    // first column of the insert row to be AINSWORTH		      
		       rs.updateString(2,"DEVELOPMENT"); // updates the second column to be 35
		       rs.insertRow();
		       //rs.moveToCurrentRow();
		       rs.absolute(1);
		       for(int c=1;c<=meta.getColumnCount();c++)
					System.out.print(meta.getColumnName(c)+"\t");
				System.out.println();
		      while (rs.next())
					System.out.printf("%5d\t%-15s\n",rs.getInt(1),rs.getString("dname"));*/
		      
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

		}
	}
}

