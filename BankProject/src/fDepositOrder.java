import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;

public class fDepositOrder implements ActionListener {

	private JFrame frame;
	private JTextField tf1, tf2, tf3;
	private JComboBox jcb1, jcb2, jcb3;
	private JButton btnInsertItem, btnSaveItem, btnPrintItem, btnCloseWindow;
	private JTable jtAccountList = null;
	private JLabel lbStatusMessage;
	
	boolean bInsertFlag = true;
	static String customer_dist[] = { "개인고객", "기업고객" };
	Object columnName[] = { "계좌번호", "예금상품명", "고객번호", "고객명", "개설일" };
	Object dataTable[][] = null;
	private JTable table;
	
	
	//String query ="select A_NO, A_ITEM_NAME, C_NO, C_NAME, A_DATE from account, customer where A_ITEM_DIST = 'A0' order by A_NO desc"
	
	//for(int i=0; i<customer_dist.length; i++) { jcb2.addItem(customer_dist[i])
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fDepositOrder window = new fDepositOrder();
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
	public fDepositOrder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\uC608\uAE08\uAC70\uB798 \uC2E0\uCCAD");
		frame.setBounds(100, 100, 960, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnInsertItem = new JButton("");
		btnInsertItem.setIcon(new ImageIcon("C:\\GitHub\\ArdorForLife\\Hello2\\TOOLBAR\\INSERT.GIF"));
		btnInsertItem.setBounds(10, 10, 30, 30);
		frame.getContentPane().add(btnInsertItem);
		
		btnSaveItem = new JButton("");
		btnSaveItem.setIcon(new ImageIcon("C:\\GitHub\\ArdorForLife\\Hello2\\TOOLBAR\\SAVE.GIF"));
		btnSaveItem.setBounds(50, 10, 30, 30);
		frame.getContentPane().add(btnSaveItem);
		
		btnPrintItem = new JButton("");
		btnPrintItem.setIcon(new ImageIcon("C:\\GitHub\\ArdorForLife\\Hello2\\TOOLBAR\\PRINT.GIF"));
		btnPrintItem.setBounds(90, 10, 30, 30);
		frame.getContentPane().add(btnPrintItem);
		
		btnCloseWindow = new JButton("");
		btnCloseWindow.setIcon(new ImageIcon("C:\\GitHub\\ArdorForLife\\Hello2\\TOOLBAR\\EXIT.GIF"));
		btnCloseWindow.setBounds(130, 10, 30, 30);
		frame.getContentPane().add(btnCloseWindow);
		
		JLabel lblNewLabel = new JLabel("\uC9C0\uC810");
		lblNewLabel.setBounds(12, 54, 57, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uACE0\uAC1D\uAD6C\uBD84");
		lblNewLabel_1.setBounds(12, 96, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uACC4\uC88C\uBC88\uD638");
		lblNewLabel_2.setBounds(12, 138, 57, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\uC608\uAE08\uC885\uB958");
		lblNewLabel_3.setBounds(12, 180, 57, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\uACC4\uC57D\uAE30\uAC04");
		lblNewLabel_4.setBounds(12, 222, 57, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\uACE0\uAC1D\uBC88\uD638");
		lblNewLabel_5.setBounds(12, 264, 57, 15);
		frame.getContentPane().add(lblNewLabel_5);
		
		jcb1 = new JComboBox();
		jcb1.setBounds(81, 54, 114, 21);
		frame.getContentPane().add(jcb1);
		
		jcb2 = new JComboBox();
		jcb2.setBounds(81, 96, 114, 21);
		frame.getContentPane().add(jcb2);
		
		jcb3 = new JComboBox();
		jcb3.setBounds(81, 180, 114, 21);
		frame.getContentPane().add(jcb3);
		
		tf1 = new JTextField();
		tf1.setBounds(81, 138, 158, 21);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(81, 222, 158, 21);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		tf3 = new JTextField();
		tf3.setBounds(81, 264, 158, 21);
		frame.getContentPane().add(tf3);
		tf3.setColumns(10);
		
		lbStatusMessage = new JLabel("");
		lbStatusMessage.setBounds(12, 490, 920, 15);
		frame.getContentPane().add(lbStatusMessage);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 299, 922, 181);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		btnInsertItem.addActionListener(this);
		btnSaveItem.addActionListener(this);
		btnPrintItem.addActionListener(this);
		btnCloseWindow.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnInsertItem) {
		}
		else if(e.getSource()==btnSaveItem) {
		}
		else if(e.getSource()==btnPrintItem) {
		}
		else if(e.getSource()==btnCloseWindow) {
			System.exit(0);
		}
	}
}
