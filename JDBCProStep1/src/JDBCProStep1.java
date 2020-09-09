import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class JDBCProStep1 implements ActionListener {
						 //1단계 : 액션리스너를 상속받는다
	
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

	/**
	 * Create the application.
	 */
	public JDBCProStep1() {
		initialize();
		init();
	}

	/**
	 * Initialize the contents of the frame.
	 */
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
		
		btnTotal = new JButton("\uC804\uCCB4\uBCF4\uAE30");	//전체보기
		btnTotal.setBounds(12, 214, 93, 23);
		frame.getContentPane().add(btnTotal);
		
		btnCancel = new JButton("\uCDE8\uC18C");
		btnCancel.setBounds(348, 214, 74, 23);
		frame.getContentPane().add(btnCancel);
		
		btnAdd = new JButton("\uCD94\uAC00");
		btnAdd.setBounds(117, 214, 69, 23);
		frame.getContentPane().add(btnAdd);
		
		btnDel = new JButton("\uC0AD\uC81C");
		btnDel.setBounds(198, 214, 69, 23);
		frame.getContentPane().add(btnDel);
		
		btnSearch = new JButton("\uAC80\uC0C9");
		btnSearch.setBounds(279, 214, 68, 23);
		frame.getContentPane().add(btnSearch);
		
		//2단계 : 컴포넌트에 액션리스너를 추가한다
		btnTotal.addActionListener(this);
		btnAdd.addActionListener(this);
		btnDel.addActionListener(this);
		btnSearch.addActionListener(this);
		btnCancel.addActionListener(this);
		
	}
	
	//3단계 : actionPerformed 구현한다
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnAdd) { //추가
			if(cmd!=ADD) {
				call(ADD);
				return;
			}
			
			frame.setTitle("추가");
		} else if(e.getSource()==btnDel) { //삭제
			if(cmd!=DELETE) {
				call(DELETE);
				return;
			}
			
			frame.setTitle("삭제");
		} else if(e.getSource()==btnSearch) { //검색
			if(cmd!=SEARCH) {
				call(SEARCH);
				return;
			}
			frame.setTitle("검색");
		} else if(e.getSource()==btnTotal) { //전체검색
			call(TOTAL);
			frame.setTitle("전체보기");
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
	}

	public void call(int cmd) {		//cmd=1,2,3
		//텍스트필드의 편집상태 on,off
		switch(cmd) {
		case ADD: 
			txtNo.setEditable(true);
			txtName.setEditable(true);
			txtEmail.setEditable(true);
			txtTel.setEditable(true);
			break;
		case DELETE:
		case SEARCH:
			txtName.setEditable(true);		//del과 search는 이름만 편집가능
			break;
		}
		//버튼의 상태 on,off
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
