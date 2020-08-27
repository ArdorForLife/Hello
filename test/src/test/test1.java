package test;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class test1 implements ActionListener {

	private JFrame frame;
	private JTextField txtNo;
	private JTextField txtName;
	private JTextField txtEmail;
	private JLabel lblNewLabel_3;
	private JTextField txtTel;
	private JTable table;
	private JButton btnTotal;
	private JButton btnAdd;
	private JButton btnDel;
	private JButton btnSearch;
	private JButton btnCancel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test1 window = new test1();
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
	public test1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uBC88\uD638");
		lblNewLabel.setBounds(23, 37, 57, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC774\uB984");
		lblNewLabel_1.setBounds(23, 83, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uC774\uBA54\uC77C");
		lblNewLabel_2.setBounds(23, 119, 57, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		txtNo = new JTextField();
		txtNo.setBounds(103, 34, 116, 21);
		frame.getContentPane().add(txtNo);
		txtNo.setColumns(10);
		
		txtName = new JTextField();
		txtName.setBounds(103, 80, 116, 21);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(103, 116, 116, 21);
		frame.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
			
		lblNewLabel_3 = new JLabel("\uC804\uD654\uBC88\uD638");
		lblNewLabel_3.setBounds(23, 153, 57, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		txtTel = new JTextField();
		txtTel.setBounds(103, 150, 116, 21);
		frame.getContentPane().add(txtTel);
		txtTel.setColumns(10);
		
		table = new JTable();
		table.setBounds(231, 37, 158, 133);
		frame.getContentPane().add(table);
		
		btnTotal = new JButton("\uC804\uCCB4\uBCF4\uAE30");	//전체보기
		btnTotal.setBounds(23, 205, 97, 23);
		frame.getContentPane().add(btnTotal);
		
		btnAdd = new JButton("\uCD94\uAC00");				//추가
		btnAdd.setBounds(133, 205, 57, 23);
		frame.getContentPane().add(btnAdd);
		
		btnDel = new JButton("\uC0AD\uC81C");				//삭제
		btnDel.setBounds(202, 205, 63, 23);
		frame.getContentPane().add(btnDel);
		
		btnSearch = new JButton("\uAC80\uC0C9");			//검색
		btnSearch.setBounds(277, 205, 57, 23);
		frame.getContentPane().add(btnSearch);
		
		btnCancel = new JButton("\uCDE8\uC18C");			//취소
		btnCancel.setBounds(339, 205, 57, 23);
		frame.getContentPane().add(btnCancel);
		
		
		btnTotal.addActionListener(this);
		btnAdd.addActionListener(this);
		btnSearch.addActionListener(this);
		btnDel.addActionListener(this);
		btnCancel.addActionListener(this);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnTotal) {
			System.out.print(txtNo.getText()+"\t");
			System.out.print(txtName.getText()+"\t");
			System.out.print(lblNewLabel_3.getText()+"\t");
			System.out.print(txtEmail.getText()+"\t");
		}
		else if(e.getSource()==btnAdd) {
			System.out.println("추가");
		}
		else if(e.getSource()==btnDel) {
			System.out.println("삭제");
		}
		else if(e.getSource()==btnSearch) {
			System.out.println("검색");
		}
		else if(e.getSource()==btnCancel) {
			System.out.println("취소");
			txtNo.setText("");
			txtName.setText("");
			txtEmail.setText("");
			txtTel.setText("");
			lblNewLabel_3.setText("");
			
		
		}
		
		
	}
	
	
}
