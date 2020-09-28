import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class mainBank implements ActionListener {

	private JFrame frame;
	
	JMenuBar menuBar;
	JMenuItem itemExit, itemCustomer, mntmNewMenuItem_2;
	
	
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
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\uC740\uD589\uBA54\uC778");
		frame.setBounds(100, 100, 960, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
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
		
		mntmNewMenuItem_2 = new JMenuItem("\uC9C0\uC810\uAD00\uB9AC");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		itemExit.addActionListener(this);
		itemCustomer.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==itemExit) {
			System.exit(0);
		}
		else if(e.getSource()==itemCustomer) {
			System.out.println("°í°´°ü¸®");
		}
	}
}
