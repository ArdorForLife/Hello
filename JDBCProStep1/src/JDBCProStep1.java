import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class JDBCProStep1 implements ActionListener {
						 //1�ܰ� : �׼Ǹ����ʸ� ��ӹ޴´�
	
	private JFrame frame;
	private JTextField txtNo;
	private JTextField txtName;
	private JTextField txtEmail;
	private JTextField txtTel;
	private JTable table;
	private JButton btnTotal, btnAdd, btnSearch, btnDel, btnCancel;	
	
	private static final int NONE=0;
	private static final int ADD=1;
	private static final int DELETE=2;
	private static final int SEARCH=3;
	private static final int TOTAL=4;
	int cmd=NONE;
	
	//db���� ���� ������
	String driver = "oracle.jdbc.OracleDriver";
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String user = "system";
	String password = "123456";
	String sql = "select * from member where id=? and pwd=?";
	Connection con = null;
	PreparedStatement pstmt = null;
	
	String sqlTotal = "select * from customer";
	String sqlInsert = "insert into customer values(?,?,?,?)";
	String selDelete = "delete from customer where name = ?";
	String sqlUpdate = "update customer set email=? tel=? where code=?";
	String sqlSearch = "select * from customer where name=?";
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JDBCProStep1 window = new JDBCProStep1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JDBCProStep1() {
		initialize();
		init();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\uACE0\uAC1D\uAD00\uB9AC\uD504\uB85C\uADF8\uB7A8");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uBC88\uD638");
		lblNewLabel.setBounds(12, 29, 57, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC774\uB984");
		lblNewLabel_1.setBounds(12, 70, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uC774\uBA54\uC77C");
		lblNewLabel_2.setBounds(12, 113, 57, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\uC804\uD654\uBC88\uD638");
		lblNewLabel_3.setBounds(12, 153, 57, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		txtNo = new JTextField();
		txtNo.setBounds(92, 26, 116, 21);
		frame.getContentPane().add(txtNo);
		txtNo.setColumns(10);
		
		txtName = new JTextField();
		txtName.setBounds(92, 67, 116, 21);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(92, 110, 116, 21);
		frame.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		txtTel = new JTextField();
		txtTel.setBounds(92, 150, 116, 21);
		frame.getContentPane().add(txtTel);
		txtTel.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(225, 29, 182, 144);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		btnTotal = new JButton("\uC804\uCCB4\uBCF4\uAE30");	//��ü����
		btnTotal.setBounds(12, 214, 81, 23);
		frame.getContentPane().add(btnTotal);
		
		btnCancel = new JButton("\uCDE8\uC18C");
		btnCancel.setBounds(360, 214, 74, 23);
		frame.getContentPane().add(btnCancel);
		
		btnAdd = new JButton("\uCD94\uAC00");
		btnAdd.setBounds(97, 214, 57, 23);
		frame.getContentPane().add(btnAdd);
		
		btnDel = new JButton("\uC0AD\uC81C");
		btnDel.setBounds(155, 214, 57, 23);
		frame.getContentPane().add(btnDel);
		
		btnSearch = new JButton("\uAC80\uC0C9");
		btnSearch.setBounds(214, 214, 62, 23);
		frame.getContentPane().add(btnSearch);
		
		JButton btnUpdate = new JButton("\uC218\uC815");
		btnUpdate.setBounds(291, 214, 57, 23);
		frame.getContentPane().add(btnUpdate);
		
		//2�ܰ� : ������Ʈ�� �׼Ǹ����ʸ� �߰��Ѵ�
		btnTotal.addActionListener(this);
		btnAdd.addActionListener(this);
		btnDel.addActionListener(this);
		btnSearch.addActionListener(this);
		btnCancel.addActionListener(this);
		
	}
	//�߰���ư�� DB
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
			if(res==1) System.out.println("����");
			else System.out.println("����");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	//������ư�� DB
	//String selDelete = "delete from customer where name = ?";
	public void del() {
		System.out.println("����");
		System.out.println(txtName.getText());
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//�˻���ư�� DB
	public void search() {
		System.out.println("�˻�");
		System.out.println(txtName.getText());
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//��ü�����ư�� DB
	public void total() {
		System.out.println("��ü����");
		System.out.println(txtName.getText());
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//3�ܰ� : actionPerformed �����Ѵ�
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnAdd) { //�߰�
			if(cmd!=ADD) {
				call(ADD);
				return;
			}
			frame.setTitle("�߰�");
			add(); 					//db�� �����Ͽ� �߰��۾��� ���۵�
		}
		else if(e.getSource()==btnDel) { //����
			if(cmd!=DELETE) {
				call(DELETE);
				return;
			}
			frame.setTitle("����");
			del();					//db�� �����Ͽ� �����۾�
		}
		else if(e.getSource()==btnSearch) { //�˻�
			if(cmd!=SEARCH) {
				call(SEARCH);
				return;
			}
			frame.setTitle("�˻�");
			search();				//db�� �����Ͽ� �̸��˻�
		}
		else if(e.getSource()==btnTotal) { //��ü�˻�
			call(TOTAL);
			frame.setTitle("��ü����");
			total();				
		} 
		System.out.println("���");
		call(NONE);
		init();
		dbcon();
	}

	public void dbcon() {
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
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
	}

	public void call(int command) {		//cmd=1,2,3
		//�ؽ�Ʈ�ʵ��� �������� on,off
		btnTotal.setEnabled(false);
		btnAdd.setEnabled(false);
		btnDel.setEnabled(false);
		btnSearch.setEnabled(false);
		btnCancel.setEnabled(false);
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
			txtName.setEditable(true);		//del�� search�� �̸��� ��������
			
			btnSearch.setEnabled(true);
			cmd=SEARCH;
			break;
		case TOTAL:
			cmd=TOTAL;
			break;
		case NONE:
			cmd=NONE;
			break;
		}
		//��ư�� ���� on,off
		btnTotal.setEnabled(false);
		btnAdd.setEnabled(false);
		btnDel.setEnabled(false);
		btnSearch.setEnabled(false);
		
		switch(cmd) {
		case ADD:
			btnAdd.setEnabled(true);
			cmd=ADD;
			break;
		case DELETE:
			btnDel.setEnabled(true);
			cmd=DELETE;
			break;
		case SEARCH:
			btnSearch.setEnabled(true);
			cmd=SEARCH;
			break;
		case TOTAL:
			btnTotal.setEnabled(true);
			cmd=TOTAL;
			break;
		case NONE:
			btnTotal.setEnabled(true);
			btnAdd.setEnabled(true);
			btnDel.setEnabled(true);
			btnSearch.setEnabled(true);
			btnCancel.setEnabled(true);
			cmd=NONE;
			break;
		}
		
	}
}