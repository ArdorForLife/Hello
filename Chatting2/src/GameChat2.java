import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GameChat2 implements ActionListener, Runnable {

	private JFrame frame;
	private JTextField name;
	private JTextField input;
	private JTextArea memo;
	private JLabel lblNewLabel;
	Socket mySocket;
	PrintWriter out;
	BufferedReader in;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameChat2 window = new GameChat2();
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
	public GameChat2() {
		initialize(); // 디자이너
		init(); // 실제 동작
	}

	public void init() {
		try {
			//서버의 ip(127.0.0.1), 포트번호를 통해 소켓 생성
			mySocket = new Socket("127.0.0.1",2587);
			
			//소켓을 통한 출력스트림을 만듦
			out = new PrintWriter(new OutputStreamWriter(mySocket.getOutputStream(), "KSC5601"), true);
			//소켓을 통한 입력스트림을 만듦
			in = new BufferedReader(new InputStreamReader(mySocket.getInputStream(), "KSC5601"), 1024);
			out.println("LOGIN|"+ mySocket);
			memo.append("[접속] \n");
		} catch (UnknownHostException e) {
			System.out.println(e.toString());
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\uCC44\uD305\uD558\uC790");
		frame.setBounds(100, 100, 720, 503);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		memo = new JTextArea();
		memo.setBackground(new Color(173, 216, 230));
		memo.setBounds(35, 10, 637, 320);
		frame.getContentPane().add(memo);

		lblNewLabel = new JLabel("\uC774\uB984");
		lblNewLabel.setBounds(50, 361, 39, 15);
		frame.getContentPane().add(lblNewLabel);

		name = new JTextField();
		name.setBounds(101, 358, 116, 21);
		frame.getContentPane().add(name);
		name.setColumns(10);

		input = new JTextField();
		input.setBounds(247, 358, 425, 21);
		frame.getContentPane().add(input);
		input.setColumns(10);

		input.addActionListener(this);
	}

	public void run() {

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == input) {
			String str = "TALK|" + name.getText() + ":" + input.getText();
			System.out.println(str);
			input.setText("");
		}
	}
}
