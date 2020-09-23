import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuItem;

public class mainBank {

	private JFrame frame;
	private	JMenuItem itemExit, itemCustomer;
	fCustomer ifCustomer;
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
		
		itemExit = new JMenuItem("\uC2DC\uC2A4\uD15C");
		itemExit.setBounds(12, 10, 131, 22);
		frame.getContentPane().add(itemExit);
		
		itemCustomer = new JMenuItem("\uACE0\uAC1D/\uC9C0\uC810\uAD00\uB9AC");
		itemCustomer.setBounds(146, 10, 131, 22);
		frame.getContentPane().add(itemCustomer);
	}
}
