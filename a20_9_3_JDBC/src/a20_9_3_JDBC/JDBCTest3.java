package a20_9_3_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCTest3 {

	public static void main(String[] args) throws Exception {
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "system";
		String password = "tjswn452";
		Connection con=null;
		Statement stmt=null;
		String sql = "update member set pwd = '999' where code = '1001'";
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			stmt = con.createStatement();
			int re = stmt.executeUpdate(sql);
			if(re==1) System.out.println("성공");
			else System.out.println("실패");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
				con.close();				//try-catch 또 묶어야함
			
		}
		
		
		
	}

}
