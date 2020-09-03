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
		
		//1단계 : DB 연결 드라이버파일을 로딩
		Class.forName(driver);
		
		//2단계 : 오라클 연결 connection con하고 ctrl+shift+o 해서 java.sql.Connection 넣기
		Connection con = DriverManager.getConnection(url,user,password);
		
		//3단계 : 빈 문장통
		Statement stmt = con.createStatement();
		
		//4단계 : 빈 문장통에 sql넣어서 실행하고 resultset 이라는 rs. <-결과통 에다가 넣음.
		ResultSet rs = stmt.executeQuery(sql);		//stmt.~~~ 라는 결과가 왼쪽의 rs에 담기는 것임.
		
		//5단계 : rs.next() - 1줄씩 console에 띄워라. rs.getString(1) - 1번째 값을 넣어라. while(존재하는동안)
		while(rs.next()) {
		System.out.print(rs.getString(1)+"\t");
		System.out.print(rs.getString(2)+"\t");
		System.out.print(rs.getString(3)+"\t");
		System.out.print(rs.getString(4)+"\t");
		System.out.println(rs.getInt(5));
		}
	}

}
