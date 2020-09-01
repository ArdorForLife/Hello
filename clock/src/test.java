import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class test {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test window = new test();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public test() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\uACFC\uC81C:\uC11D\uC120\uC8FC");
		frame.setBounds(100, 100, 619, 235);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC624\uB298\uC758 \uB0A0\uC9DC\uC640 \uC2DC\uAC04");
		lblNewLabel.setBounds(12, 10, 120, 15);
		frame.getContentPane().add(lblNewLabel);
	}
}
