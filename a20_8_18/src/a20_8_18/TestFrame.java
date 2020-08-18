package a20_8_18;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TestFrame extends JFrame {

	JLabel lbl;
	JButton btn=null;
	JTextField txt=null;
	static TestFrame frame=null;
	public static void main(String[] args) {
		frame=new TestFrame();
	
	}
	public TestFrame() {
		this.setVisible(true);
		this.setBounds(10, 10, 500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		lbl=new JLabel("이름");
		btn=new JButton("전송");
		txt=new JTextField();
		this.add(btn);
		this.add(lbl);
		this.add(txt);
	}
}
