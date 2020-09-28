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
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

public class branch implements ActionListener {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf5;
	
	JButton btnInsert, btnSave, btnCancel;
	
	private static final int NONE = 0;
	private static final int ADD = 1;
	private static final int SAVE = 2;
	private static final int TOTAL =3;
	int cmd=NONE;
	
	MyModel model;
	

	String driver = "oracle.jdbc.OracleDriver";
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String user = "system";
	String password = "123456";
	Connection con = null;
	PreparedStatement pstmt = null;
	PreparedStatement pstmtTotal, pstmtTotalScroll;
	PreparedStatement pstmtSearch, pstmtSearchScroll;
	
	String sqlTotal = "select * from branch order by b_no desc";
	String sqlInsert = "insert into branch values(?,?,?,?,?)";
	String sqlSave = "update branch set b_name=?, b_addr=?, b_phone=?, b_assets=? where b_no=?";
	private JTable table;
	//
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					branch window = new branch();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public branch() {
		initialize();
		init();
		dbcon();
		total();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	public void dbcon() {
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\uC9C0\uC810\uAD00\uB9AC");
		frame.setBounds(100, 100, 904, 501);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnInsert = new JButton("\uCD94\uAC00");
		btnInsert.setBounds(24, 20, 97, 23);
		frame.getContentPane().add(btnInsert);
		
		btnSave = new JButton("\uC800\uC7A5");
		btnSave.setBounds(147, 20, 97, 23);
		frame.getContentPane().add(btnSave);
		
		btnCancel = new JButton("\uCDE8\uC18C");
		btnCancel.setBounds(275, 20, 97, 23);
		frame.getContentPane().add(btnCancel);
		
		JLabel lblNewLabel = new JLabel("\uC9C0\uC810\uBC88\uD638");
		lblNewLabel.setBounds(24, 60, 57, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC9C0\uC810\uBA85");
		lblNewLabel_1.setBounds(24, 105, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uC8FC\uC18C");
		lblNewLabel_2.setBounds(24, 150, 57, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\uC804\uD654\uBC88\uD638");
		lblNewLabel_3.setBounds(24, 195, 57, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\uC790\uC0B0\uCD1D\uC561");
		lblNewLabel_4.setBounds(24, 240, 57, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		tf1 = new JTextField();
		tf1.setBounds(106, 57, 116, 21);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(106, 102, 116, 21);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		tf3 = new JTextField();
		tf3.setBounds(106, 147, 116, 21);
		frame.getContentPane().add(tf3);
		tf3.setColumns(10);
		
		tf4 = new JTextField();
		tf4.setBounds(106, 192, 116, 21);
		frame.getContentPane().add(tf4);
		tf4.setColumns(10);
		
		tf5 = new JTextField();
		tf5.setBounds(106, 237, 116, 21);
		frame.getContentPane().add(tf5);
		tf5.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 277, 852, 175);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		btnInsert.addActionListener(this);
		btnSave.addActionListener(this);
		btnCancel.addActionListener(this);
	}

	public void add() {
		String no = tf1.getText();
		String name = tf2.getText();
		String addr = tf3.getText();
		String phone = tf4.getText();
		String assets = tf5.getText();
		System.out.println(no+","+name+","+addr+","+phone+","+assets);
		try {
			pstmt = con.prepareStatement(sqlInsert);
			pstmt.setInt(1, Integer.valueOf(no));
			pstmt.setString(2, name);
			pstmt.setString(3, addr);
			pstmt.setString(4, phone);
			pstmt.setInt(5, Integer.valueOf(assets));
			int res = pstmt.executeUpdate();
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
	
	public void save() {
		String no = tf1.getText();
		String name = tf2.getText();
		String addr = tf3.getText();
		String phone = tf4.getText();
		String assets = tf5.getText();
		System.out.println(no+","+name+","+addr+","+phone+","+assets);
		try {
			pstmt = con.prepareStatement(sqlSave);
			pstmt.setString(1, name);
			pstmt.setString(2, addr);
			pstmt.setString(3, phone);
			pstmt.setInt(4, Integer.valueOf(assets));
			pstmt.setInt(5, Integer.valueOf(no));
			int res = pstmt.executeUpdate();
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
	
	public void total() {
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
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnInsert) {
			if(cmd!=ADD) {
				call(ADD);
				return;
			}
			add();
			total();
		}
		else if(e.getSource()==btnSave) {
			if(cmd!=SAVE) {
				call(SAVE);
				return;
			}
			save();
			total();
		}
		call(NONE);
		init();
	}
	
	public void init() {
		tf1.setText("");
		tf2.setText("");
		tf3.setText("");
		tf4.setText("");
		tf5.setText("");
		tf1.setEditable(false);
		tf2.setEditable(false);
		tf3.setEditable(false);
		tf4.setEditable(false);
		tf5.setEditable(false);
		btnInsert.setEnabled(true);
		btnSave.setEnabled(true);
		btnCancel.setEnabled(true);
	}
	
	public void call(int command) {
		btnInsert.setEnabled(false);
		btnSave.setEnabled(false);
		btnCancel.setEnabled(false);
		
		switch(command) {
		case ADD:
			tf1.setEditable(true);
			tf2.setEditable(true);
			tf3.setEditable(true);
			tf4.setEditable(true);
			tf5.setEditable(true);
			
			btnInsert.setEnabled(true);
			btnCancel.setEnabled(true);
			cmd=ADD;
			break;
		case SAVE:
			tf1.setEditable(true);
			tf2.setEditable(true);
			tf3.setEditable(true);
			tf4.setEditable(true);
			tf5.setEditable(true);
			
			btnSave.setEnabled(true);
			btnCancel.setEnabled(true);
			cmd=SAVE;
			break;
		case NONE:
			cmd=NONE;
			break;
		}
	}
}
