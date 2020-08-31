package test;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class FrameTest  {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	

JButton btnMoveFirst,btnMovePrev;
       


public static void main(String[] args) {
	
	FrameTest window = new FrameTest();
	
	window.frame.setVisible(true);
}
	public FrameTest() {
		initialize();
	}
	

private void initialize() {
		frame = new JFrame();
		frame.add(btnMoveFirst);
		frame.add(btnMovePrev);
	}
}
