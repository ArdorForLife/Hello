import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.table.AbstractTableModel;

public class MyModel extends AbstractTableModel {
	
	Object [][]data;							//멤버변수
	String []columnName;						//멤버변수
												//밑에는 멤버 메소드들
	
	int rows, cols;
	
	public int getRowCount() {					//행의 갯수 리턴
		return data.length;				//2개의 레코드(2가 반환될것임)
	}
	
	//select count(*) from customer; 과 같은 역할을 하는
	//rsScroll.last();
	//rows=rsScroll.getRow(); 두 줄
	public void getRowCount(ResultSet rsScroll) {
		try {
			rsScroll.last();
			rows=rsScroll.getRow();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int getColumnCount() {				//열의 갯수 리턴
		return columnName.length;						//4개의 필드(4가 반환될것임)
	}

	public Object getValueAt(int arg0, int arg1) {		//행과 열의 각각 값에 해당하는 구역을 리턴
		return data[arg0][arg1];				//낱개씩 리턴
	}

	public String getColumnName(int column) {	//칼럼의 이름을 가져옴 1부터 시작함
		return columnName[column];
	}
	
	
	
	public void setData(ResultSet rs) {			//select(조회)된 결과값(ResultSet)을 rs에 보냄
		try {
			ResultSetMetaData rsmd;
			
			rsmd = rs.getMetaData();
			cols = rsmd.getColumnCount();		//4개의 컬럼(필드)
			columnName = new String[cols];
			
			for(int i=0; i<cols; i++)
				columnName[i] = rsmd.getColumnName(i+1);
			
			data = new Object[rows][cols];
			
			int r=0, c;
			
			while(rs.next()) {
				for(c=0; c<cols; c++) {
					data[r][c]=rs.getObject(c+1);
					}
				r++;
			}
			
			rs.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}