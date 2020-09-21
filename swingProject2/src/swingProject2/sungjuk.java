package swingProject2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class sungjuk {

	private JFrame frame;
	private JTextField txtNo;
	private JTextField txtName;
	private JTextField txtKor;
	private JTextField txtMat;
	private JTextField txtEng;
	private JTextField txtTot;
	private JTextField txtAvg;
	private JTable table;
	private JButton btnCal, btnAdd, btnDel, btnUpdate, btnTotal, btnFirst, btnPrev, btnNext, btnLast;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sungjuk window = new sungjuk();
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
	public sungjuk() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 612, 404);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uD559\uBC88");
		lblNewLabel.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		lblNewLabel.setBounds(12, 9, 57, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC774\uB984");
		lblNewLabel_1.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(12, 44, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uAD6D\uC5B4");
		lblNewLabel_2.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(12, 82, 57, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\uC218\uD559");
		lblNewLabel_3.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(12, 120, 57, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		txtNo = new JTextField();
		txtNo.setBounds(60, 6, 116, 21);
		frame.getContentPane().add(txtNo);
		txtNo.setColumns(10);
		
		txtName = new JTextField();
		txtName.setBounds(60, 42, 116, 21);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtKor = new JTextField();
		txtKor.setBounds(60, 81, 116, 21);
		frame.getContentPane().add(txtKor);
		txtKor.setColumns(10);
		
		txtMat = new JTextField();
		txtMat.setBounds(60, 117, 116, 21);
		frame.getContentPane().add(txtMat);
		txtMat.setColumns(10);
		
		btnCal = new JButton("\uACC4\uC0B0");					//°è»ê
		btnCal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String kors=txtKor.getText();					//ÅØ½ºÆ®ÇÊµåÀÇ °ªÀº ¹®ÀÚ¿­¸¸ °¡´É
				String engs=txtEng.getText();
				String mats=txtMat.getText();
				int kor = Integer.valueOf(kors);				//Á¤¼ö·Î º¯È¯ÇØ¾ß °è»ê°¡´É
				int eng = Integer.valueOf(engs);
				int mat = Integer.valueOf(mats);
				int tot=kor+eng+mat;							//ÃÑÁ¡±¸ÇÏ±â
				double avg=tot/3.0;								//Æò±Õ±¸ÇÏ±â
				String tots=String.valueOf(tot);
				String avgs=String.valueOf(avg);
				txtTot.setText(tots);							//ÅØ½ºÆ®ÇÊµå¿¡´Â ¹®ÀÚ¿­¸¸ °¡´É
				txtAvg.setText(avgs);
			}
		});
		btnCal.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		btnCal.setBounds(25, 332, 97, 23);
		frame.getContentPane().add(btnCal);
		
		btnAdd = new JButton("\uCD94\uAC00");
		btnAdd.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		btnAdd.setBounds(140, 332, 97, 23);
		frame.getContentPane().add(btnAdd);
		
		JLabel lblNewLabel_4 = new JLabel("\uC601\uC5B4");
		lblNewLabel_4.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(12, 158, 57, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		txtEng = new JTextField();
		txtEng.setBounds(60, 155, 116, 21);
		frame.getContentPane().add(txtEng);
		txtEng.setColumns(10);
		
		JLabel label = new JLabel("\uCD1D\uC810");
		label.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		label.setBounds(12, 196, 57, 15);
		frame.getContentPane().add(label);
		
		txtTot = new JTextField();
		txtTot.setEditable(false);
		txtTot.setBounds(60, 193, 116, 21);
		frame.getContentPane().add(txtTot);
		txtTot.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("\uD3C9\uADE0");
		lblNewLabel_5.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(12, 234, 57, 15);
		frame.getContentPane().add(lblNewLabel_5);
		
		txtAvg = new JTextField();
		txtAvg.setEditable(false);
		txtAvg.setBounds(60, 231, 116, 21);
		frame.getContentPane().add(txtAvg);
		txtAvg.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(188, 5, 394, 305);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		btnDel = new JButton("\uC0AD\uC81C");
		btnDel.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		btnDel.setBounds(255, 332, 97, 23);
		frame.getContentPane().add(btnDel);
		
		btnUpdate = new JButton("\uC218\uC815");
		btnUpdate.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		btnUpdate.setBounds(370, 332, 97, 23);
		frame.getContentPane().add(btnUpdate);
		
		btnTotal = new JButton("\uC804\uCCB4\uBCF4\uAE30");
		btnTotal.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		btnTotal.setBounds(485, 332, 97, 23);
		frame.getContentPane().add(btnTotal);
		
		btnFirst = new JButton("");
		btnFirst.setIcon(new ImageIcon("C:\\GitHub\\ArdorForLife\\Hello2\\TOOLBAR\\FIRST.GIF"));
		btnFirst.setBounds(25, 280, 30, 30);
		frame.getContentPane().add(btnFirst);
		
		btnPrev = new JButton("");
		btnPrev.setIcon(new ImageIcon("C:\\GitHub\\ArdorForLife\\Hello2\\TOOLBAR\\PREV.GIF"));
		btnPrev.setBounds(60, 280, 30, 30);
		frame.getContentPane().add(btnPrev);
		
		btnNext = new JButton("");
		btnNext.setIcon(new ImageIcon("C:\\GitHub\\ArdorForLife\\Hello2\\TOOLBAR\\NEXT.GIF"));
		btnNext.setBounds(95, 280, 30, 30);
		frame.getContentPane().add(btnNext);
		
		btnLast = new JButton("");
		btnLast.setIcon(new ImageIcon("C:\\GitHub\\ArdorForLife\\Hello2\\TOOLBAR\\LAST.GIF"));
		btnLast.setBounds(130, 280, 30, 30);
		frame.getContentPane().add(btnLast);
	}
}
