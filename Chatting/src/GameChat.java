import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class GameChat extends Applet implements ActionListener, Runnable { // ���ͳ� Ŭ�� ������ �׼Ǹ����� ���
	Socket mySocket = null;
	PrintWriter out = null;
	BufferedReader in = null;

	Thread clock;
	TextArea memo;
	TextField name;
	TextField input;
	Panel myPanel;

	// ���ø����κ��� ��� �޾����� init���� ���� ����
	public void init() {
		try {
			// ������ ip(127.0.0.1), ��Ʈ��ȣ�� ���� ���� ����
			mySocket = new Socket("192.168.0.6", 2587);

			// ������ ���� ��½�Ʈ���� ����
			out = new PrintWriter(new OutputStreamWriter(mySocket.getOutputStream(), "KSC5601"), true);
			// ������ ���� �Է½�Ʈ���� ����
			in = new BufferedReader(new InputStreamReader(mySocket.getInputStream(), "KSC5601"), 1024);
		} catch (UnknownHostException e) {
			System.out.println(e.toString());
		} catch (IOException e) {
			System.out.println(e.toString());
		}

		// GUI�κ�

		// ��ġ�����ڷ� ���巹�̾ƿ�(���������߾�) ����
		setLayout(new BorderLayout());
		// memo��� �ؽ�Ʈ ������
		memo = new TextArea(10, 55);
		// �߾ӿ� memo�� �߰��϶�
		add("Center", memo);

		// �г� ����
		myPanel = new Panel();
		// 8ĭ¥�� �ؽ�Ʈ�ʵ� ����
		name = new TextField(8);
		// �ؽ�Ʈ �ʵ忡 "��ȭ��" �̶�� �ؽ�Ʈ�� ����
		name.setText("��ȭ��");
		// �гο� name�� �߰�
		myPanel.add(name);
		// 40ĭ¥�� �ؽ�Ʈ�ʵ� ����
		input = new TextField(40);
		// input�� �׼Ǹ����� �߰�
		input.addActionListener(this);
		// �гο� input�� �߰�
		myPanel.add(input);
		// �ؽ�Ʈ �ʵ忡 "�޼����� �Է��ϼ���." �̶�� �ؽ�Ʈ�� ����
		input.setText("�޼����� �Է��ϼ���.");
		// �г��� ���ʿ� input ����
		add("South", myPanel);
	}

	public void start() {
		if (clock == null) {
			clock = new Thread(this);
			clock.start();
		}
	}

	// ChatThread���� start()�ϸ� ���� ��
	public void run() {
		out.println("LOGIN|" + mySocket); // �����忡�� start()�ϸ� �����
		memo.append("[����] " + getCodeBase().toString() + "\n"); //
		// ���� ���ø� �ڵ尡 ���ԵǾ� �ִ� html������ �ִ� ��α������� �����Ѵ�

		try {
			// ���ѷ��� ����
			while (true) {
				// ������ ���ؼ� �Է��� �޾Ƽ� msg�� ����
				String msg = in.readLine();
				// ���� �������� ������ �ƴϰ� null���� �ƴϸ�
				if (!msg.equals("") && !msg.equals(null)) {
					// memo��� �ؽ�Ʈ����� msg�� �߰��ض�
					memo.append(msg + "\n");
				}
			}
		} catch (IOException e) {
			memo.append(e.toString() + "\n");
		}
	}

	// input���� ���͸� ġ�ų� ���콺�� Ŭ���ϸ� e�� ���޵ȴ�.
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == input) {
			// input�� �Էµ� ���� �����ͼ� data�� �����϶�
			String data = input.getText();
			// input�� �������� ����
			input.setText("");
			// TALK| �̸�: �޼��� �������� out�̶�� printwriter�� ���� �������� ����Ѵ�.
			out.println("TALK|" + name.getText() + ": " + data);
			// ��½�Ʈ���� �������� ���� ���� ��� ���
			out.flush();
		}
	}

	public void stop() {
		if ((clock != null) && (clock.isAlive())) {
			clock = null;
		}

		out.println("LOGOUT|" + name.getText());
		out.flush();

		try {
			out.close();
			in.close();
			mySocket.close();
		} catch (IOException e) {
			memo.append(e.toString() + "\n");
		}
	}
}