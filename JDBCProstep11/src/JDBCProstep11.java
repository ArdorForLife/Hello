import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class JDBCProstep11 implements ActionListener {
	 //1단계 : 액션리스너를 상속받는다
	
	private JFrame frame;
	private JTextField txtNo;
	private JTextField txtName;
	private JTextField txtEmail;
	private JTextField txtTel;
	private JTable table;
	private JButton btnTotal, btnAdd, btnSearch, btnDel, btnCancel, btnUpdate;
	
	private static final int NONE=0;			//취소
	private static final int ADD=1;				//추가(insert)
	private static final int DELETE=2;			//삭제(delete)
	private static final int SEARCH=3;			//검색(select)
	private static final int TOTAL=4;			//검색(select)
	private static final int UPDATE=5;			//(update)
	int cmd=NONE;
	
	MyModel model;
	
	//DB연결을 위한 변수들
	String driver = "oracle.jdbc.OracleDriver";
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String user = "system";
	String password = "123456";
	Connection con = null;
	PreparedStatement pstmt = null;
	PreparedStatement pstmtTotal, pstmtTotalScroll;
	PreparedStatement pstmtSearch, pstmtSearchScroll;
	
	String sql = "select * from member where id=? and pwd=?";
	String sqlTotal = "select * from customer";
	String sqlInsert = "insert into customer values(?,?,?,?)";
	String sqlDelete = "delete from customer where name = ?";
	String sqlUpdate = "update customer set email=?, tel=? where code=?";
	String sqlSearch = "select * from customer where name=?";
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JDBCProstep11 window = new JDBCProstep11();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JDBCProstep11() {
		initialize();
		init();
		dbcon();
	}
	
	public void dbcon() {
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url, user, password);
			System.out.println("성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\uACE0\uAC1D\uAD00\uB9AC\uD504\uB85C\uADF8\uB7A8");
		frame.setBounds(100, 100, 960, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uBC88\uD638");
		lblNewLabel.setBounds(33, 41, 57, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC774\uB984");
		lblNewLabel_1.setBounds(33, 83, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uC774\uBA54\uC77C");
		lblNewLabel_2.setBounds(33, 134, 57, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\uC804\uD654\uBC88\uD638");
		lblNewLabel_3.setBounds(33, 187, 57, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		txtNo = new JTextField();
		txtNo.setBounds(113, 38, 116, 21);
		frame.getContentPane().add(txtNo);
		txtNo.setColumns(10);
		
		txtName = new JTextField();
		txtName.setBounds(113, 80, 116, 21);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(113, 131, 116, 21);
		frame.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		txtTel = new JTextField();
		txtTel.setBounds(113, 181, 116, 21);
		frame.getContentPane().add(txtTel);
		txtTel.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(265, 41, 214, 164);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		btnTotal = new JButton("\uC804\uCCB4\uBCF4\uAE30");
		btnTotal.setBounds(4, 267, 83, 23);
		frame.getContentPane().add(btnTotal);
		
		btnAdd = new JButton("\uCD94\uAC00");
		btnAdd.setBounds(91, 267, 83, 23);
		frame.getContentPane().add(btnAdd);
		
		btnDel = new JButton("\uC0AD\uC81C");
		btnDel.setBounds(178, 267, 83, 23);
		frame.getContentPane().add(btnDel);
		
		btnSearch = new JButton("\uAC80\uC0C9");
		btnSearch.setBounds(265, 267, 83, 23);
		frame.getContentPane().add(btnSearch);
		
		btnCancel = new JButton("\uCDE8\uC18C");
		btnCancel.setBounds(445, 267, 83, 23);
		frame.getContentPane().add(btnCancel);
		
		btnUpdate = new JButton("\uC218\uC815");
		btnUpdate.setBounds(353, 267, 83, 23);
		frame.getContentPane().add(btnUpdate);
		
		//2단계 : 컴포넌트에 액션리스너를 추가한다
		btnTotal.addActionListener(this);
		btnAdd.addActionListener(this);
		btnDel.addActionListener(this);
		btnSearch.addActionListener(this);
		btnCancel.addActionListener(this);
		btnUpdate.addActionListener(this);
	}
	
	//추가버튼의 DB
	//String sqlInsert = "insert into customer values(?,?,?,?)";
	public void add() {
		String no = txtNo.getText();
		String name = txtName.getText();
		String email = txtEmail.getText();
		String tel = txtTel.getText();
		System.out.println(no+","+name+","+email+","+tel);
		try {
			pstmt = con.prepareStatement(sqlInsert);
			pstmt.setInt(1, Integer.valueOf(no));
			pstmt.setString(2, name);
			pstmt.setString(3, email);
			pstmt.setString(4, tel);
			int res = pstmt.executeUpdate();
			if(res==1) System.out.println("성공");
			else System.out.println("실패");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();	
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	//삭제버튼의 DB
	//String sqlDelete = "delete from customer where name = ?";
	public void del() {
		System.out.println(txtName.getText());
		try {
			String name = txtName.getText();			//txtName의 값을 가져오기
			pstmt = con.prepareStatement(sqlDelete);	//준비된 선언에 문법을 넣어놓음
			pstmt.setString(1,  name);					//첫번째로 name을 가져와서 1번 물음표에 넣어라
			int res = pstmt.executeUpdate();
			if(res==1) System.out.println("삭제되었습니다.");
			else System.out.println("실패했습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	//검색버튼의 DB
	//String sqlSearch = "select * from customer where name=?";
	public void search() {
		System.out.println(txtName.getText());
		try {
			String name = txtName.getText();
			pstmtSearchScroll = con.prepareStatement(sqlSearch,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			pstmtSearch = con.prepareStatement(sqlSearch);
			pstmtSearchScroll.setString(1, name);
			pstmtSearch.setString(1, name);
			
			ResultSet rsScroll = pstmtSearchScroll.executeQuery();
			ResultSet rs = pstmtSearch.executeQuery();
			if(model==null) model = new MyModel();
			model.getRowCount(rsScroll);
			model.setData(rs);
			table.setModel(model);
			table.updateUI();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmtSearchScroll.close();
				pstmtSearch.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
	}
	
	//전체보기버튼의 DB
	//String sqlTotal = "select * from customer";
	public void total() {
		System.out.println("전체보기");
		System.out.println(txtName.getText());
		try {
			pstmtTotalScroll = con.prepareStatement(sqlTotal,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			pstmtTotal = con.prepareStatement(sqlTotal);
			
			ResultSet rsScroll = pstmtTotalScroll.executeQuery();
			ResultSet rs = pstmtTotal.executeQuery();
			if(model==null) model = new MyModel();
			model.getRowCount(rsScroll);
			model.setData(rs);
			table.setModel(model);
			table.updateUI();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmtTotalScroll.close();
				pstmtTotal.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	//수정버튼의 DB
	//String sqlUpdate = "update customer set email=?, tel=? where code=?";
	public void update() {
		System.out.println("수정");
		String no = txtNo.getText();			
		String email = txtEmail.getText();
		String tel = txtTel.getText();
		try {
			pstmt = con.prepareStatement(sqlUpdate);	
			pstmt.setString(1, email);
			pstmt.setString(2, tel);
			pstmt.setInt(3, Integer.valueOf(no));
			int res = pstmt.executeUpdate();
			if(res==1) System.out.println("수정되었습니다.");
			else System.out.println("실패했습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnAdd) {
			if(cmd!=ADD) {
				call(ADD);
				return;
			}
			frame.setTitle("추가");
			add();
			total();
		}
		else if(e.getSource()==btnDel) {
			if(cmd!=DELETE) {
				call(DELETE);
				return;
			}
			frame.setTitle("삭제");
			del();
			total();
		}
		else if(e.getSource()==btnSearch) {
			if(cmd!=SEARCH) {
				call(SEARCH);
				return;
			}
			frame.setTitle("검색");
			search();
		}
		else if(e.getSource()==btnUpdate) {
			if(cmd!=UPDATE) {
				call(UPDATE);
				return;
			}
			frame.setTitle("수정");
			update();
			total();
		}
		else if(e.getSource()==btnTotal) {
			call(TOTAL);
			frame.setTitle("전체보기");
			total();
		}
		
		System.out.println("취소");
		call(NONE);
		init();
	}
		
	private void init() {
		txtNo.setText("");
		txtName.setText("");
		txtEmail.setText("");
		txtTel.setText("");
		txtNo.setEditable(false);
		txtName.setEditable(false);
		txtEmail.setEditable(false);
		txtTel.setEditable(false);
		btnTotal.setEnabled(true);
		btnAdd.setEnabled(true);
		btnDel.setEnabled(true);
		btnSearch.setEnabled(true);
		btnCancel.setEnabled(true);
		btnUpdate.setEnabled(true);
	}
	
	public void call(int command) {			//cmd=1,2,3,4,5
		btnTotal.setEnabled(false);
		btnAdd.setEnabled(false);
		btnDel.setEnabled(false);
		btnSearch.setEnabled(false);
		btnCancel.setEnabled(true);
		btnUpdate.setEnabled(false);
		switch(command) {
		case ADD:
			txtNo.setEditable(true);
			txtName.setEditable(true);
			txtEmail.setEditable(true);
			txtTel.setEditable(true);
			
			btnAdd.setEnabled(true);
			cmd=ADD;
			break;
		case DELETE:
			txtName.setEditable(true);
			
			btnDel.setEnabled(true);
			cmd=DELETE;
			break;
		case SEARCH:
			txtName.setEditable(true);
			
			btnSearch.setEnabled(true);
			cmd=SEARCH;
			break;
		case UPDATE:
			txtNo.setEditable(true);
			txtEmail.setEditable(true);
			txtTel.setEditable(true);
			
			btnUpdate.setEnabled(true);
			cmd=UPDATE;
			break;
		case TOTAL:
			cmd=TOTAL;
			break;
		case NONE:
			cmd=NONE;
			break;
		}
	}
}
