import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.table.AbstractTableModel;

public class MyModel extends AbstractTableModel {
	
	Object [][]data;							//�������
	String []columnName;						//�������
												//�ؿ��� ��� �޼ҵ��
	
	int rows, cols;
	
	public int getRowCount() {					//���� ���� ����
		return data.length;				//2���� ���ڵ�(2�� ��ȯ�ɰ���)
	}
	
	//select count(*) from customer; �� ���� ������ �ϴ�
	//rsScroll.last();
	//rows=rsScroll.getRow(); �� ��
	public void getRowCount(ResultSet rsScroll) {
		try {
			rsScroll.last();
			rows=rsScroll.getRow();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int getColumnCount() {				//���� ���� ����
		return columnName.length;						//4���� �ʵ�(4�� ��ȯ�ɰ���)
	}

	public Object getValueAt(int arg0, int arg1) {		//��� ���� ���� ���� �ش��ϴ� ������ ����
		return data[arg0][arg1];				//������ ����
	}

	public String getColumnName(int column) {	//Į���� �̸��� ������ 1���� ������
		return columnName[column];
	}
	
	
	
	public void setData(ResultSet rs) {			//select(��ȸ)�� �����(ResultSet)�� rs�� ����
		try {
			ResultSetMetaData rsmd;
			
			rsmd = rs.getMetaData();
			cols = rsmd.getColumnCount();		//4���� �÷�(�ʵ�)
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