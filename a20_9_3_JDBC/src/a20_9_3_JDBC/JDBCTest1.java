package a20_9_3_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest1 {

	public static void main(String[] args) throws Exception {
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "system";
		String password = "tjswn452";
		String sql = "select * from member";
		
		//1�ܰ� : DB ���� ����̹������� �ε�
		Class.forName(driver);
		
		//2�ܰ� : ����Ŭ ���� connection con�ϰ� ctrl+shift+o �ؼ� java.sql.Connection �ֱ�
		Connection con = DriverManager.getConnection(url,user,password);
		
		//3�ܰ� : �� ������
		Statement stmt = con.createStatement();
		
		//4�ܰ� : �� �����뿡 sql�־ �����ϰ� resultset �̶�� rs. <-����� ���ٰ� ����.
		ResultSet rs = stmt.executeQuery(sql);		//stmt.~~~ ��� ����� ������ rs�� ���� ����.
		
		//5�ܰ� : rs.next() - 1�پ� console�� �����. rs.getString(1) - 1��° ���� �־��. while(�����ϴµ���)
		while(rs.next()) {
		System.out.print(rs.getString(1)+"\t");
		System.out.print(rs.getString(2)+"\t");
		System.out.print(rs.getString(3)+"\t");
		System.out.print(rs.getString(4)+"\t");
		System.out.println(rs.getInt(5));
		}
	}

}
