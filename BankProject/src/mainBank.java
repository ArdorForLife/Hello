import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class mainBank implements ActionListener {

	private JFrame frame;

	JMenuBar menuBar;
	JMenuItem itemExit, itemCustomer, itemBranch;
	fCustomer ifCustomer;
	frmBranch ifBranch;
	frmDepositKind ifDepositKind;
	frmDepositOrder ifDepositOrder;
	frmDepositStatement ifDepositStatement;
	frmInOut ifInOut;
	frmLoanKind ifLoanKind;
	frmLoanOrder ifLoanOrder;
	frmPayBack ifPayBack;
	
	private String driver = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String user = "system";
	private String pwd = "123456";
	
	static Connection conn = null;
	static ResultSet rs = null;
	static Statement stmt = null;
	private JMenu mnNewMenu_2;
	private JMenu mnNewMenu_3;
	private JMenu mnNewMenu_4;
	private JMenuItem menuItem;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem menuItem_1;
	private JMenuItem mntmNewMenuItem_3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainBank window = new mainBank();
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
	public mainBank() {
		dbConnect();
		initialize();
	}

	private void dbConnect() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\uC740\uD589\uBA54\uC778");
		frame.setBounds(100, 100, 960, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.getContentPane().setLayout(null);

		menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("\uC2DC\uC2A4\uD15C");
		menuBar.add(mnNewMenu);

		itemExit = new JMenuItem("\uC885\uB8CC");
		mnNewMenu.add(itemExit);

		JMenu mnNewMenu_1 = new JMenu("\uACE0\uAC1D/\uC9C0\uC810\uAD00\uB9AC");
		menuBar.add(mnNewMenu_1);

		itemCustomer = new JMenuItem("\uACE0\uAC1D\uAD00\uB9AC");
		mnNewMenu_1.add(itemCustomer);

		itemBranch = new JMenuItem("\uC9C0\uC810\uAD00\uB9AC");
		mnNewMenu_1.add(itemBranch);
		
		mnNewMenu_2 = new JMenu("\uB300\uCD9C");
		menuBar.add(mnNewMenu_2);
		
		mntmNewMenuItem_2 = new JMenuItem("\uB300\uCD9C\uC885\uB958");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuLoanKind();
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_2);
		
		menuItem_1 = new JMenuItem("\uB300\uCD9C\uC2E0\uCCAD");
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuLoanOrder();
			}
		});
		mnNewMenu_2.add(menuItem_1);
		
		mnNewMenu_3 = new JMenu("\uC785\uCD9C\uAE08");
		menuBar.add(mnNewMenu_3);
		
		mntmNewMenuItem_3 = new JMenuItem("\uC785\uCD9C\uAE08");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuInOut();
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_3);
		
		mnNewMenu_4 = new JMenu("\uC608\uAE08");
		menuBar.add(mnNewMenu_4);
		
		menuItem = new JMenuItem("\uC608\uAE08\uC885\uB958");
		mnNewMenu_4.add(menuItem);
		
		mntmNewMenuItem = new JMenuItem("\uC608\uAE08\uC2E0\uCCAD");
		mnNewMenu_4.add(mntmNewMenuItem);
		
		mntmNewMenuItem_1 = new JMenuItem("\uC608\uAE08\uC870\uD68C");
		mnNewMenu_4.add(mntmNewMenuItem_1);

		itemExit.addActionListener(this);
		itemCustomer.addActionListener(this);
		itemBranch.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == itemCustomer)
			menuCustomer();
		if (e.getSource() == itemExit)
			menuExit();
		if (e.getSource() == itemBranch)
			menuBranch();
	}

	public void menuCustomer() {
		ifCustomer = new fCustomer();
		ifCustomer.pack(); // 현재 자리에 장착
		ifCustomer.setVisible(true); // 보이도록 함
		frame.getContentPane().add(ifCustomer);
		try {
			ifCustomer.setSelected(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void menuExit() {
		System.exit(0);
	}
	
	public void menuBranch() {
		ifBranch = new frmBranch("지점관리", conn, null);
		ifBranch.pack(); // 현재 자리에 장착
		ifBranch.setVisible(true); // 보이도록 함
		//frame.getContentPane().add(ifBranch);
		try {
			ifBranch.setSelected(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void menuInOut() {
		
	}
	
	public void menuLoanKind() {
		
	}
	
	public void menuLoanOrder() {
		
	}
}
