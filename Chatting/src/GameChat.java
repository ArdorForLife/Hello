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

public class GameChat extends Applet implements ActionListener, Runnable { // 엔터나 클릭 때문에 액션리스너 상속
	Socket mySocket = null;
	PrintWriter out = null;
	BufferedReader in = null;

	Thread clock;
	TextArea memo;
	TextField name;
	TextField input;
	Panel myPanel;

	// 애플릿으로부터 상속 받았으면 init부터 먼저 실행
	public void init() {
		try {
			// 서버의 ip(127.0.0.1), 포트번호를 통해 소켓 생성
			mySocket = new Socket("192.168.0.6", 2587);

			// 소켓을 통한 출력스트림을 만듦
			out = new PrintWriter(new OutputStreamWriter(mySocket.getOutputStream(), "KSC5601"), true);
			// 소켓을 통한 입력스트림을 만듦
			in = new BufferedReader(new InputStreamReader(mySocket.getInputStream(), "KSC5601"), 1024);
		} catch (UnknownHostException e) {
			System.out.println(e.toString());
		} catch (IOException e) {
			System.out.println(e.toString());
		}

		// GUI부분

		// 배치관리자로 보드레이아웃(동서남북중앙) 선택
		setLayout(new BorderLayout());
		// memo라는 텍스트 에리어
		memo = new TextArea(10, 55);
		// 중앙에 memo를 추가하라
		add("Center", memo);

		// 패널 생성
		myPanel = new Panel();
		// 8칸짜리 텍스트필드 생성
		name = new TextField(8);
		// 텍스트 필드에 "대화명" 이라는 텍스트를 셋팅
		name.setText("대화명");
		// 패널에 name을 추가
		myPanel.add(name);
		// 40칸짜리 텍스트필드 생성
		input = new TextField(40);
		// input에 액션리스너 추가
		input.addActionListener(this);
		// 패널에 input을 추가
		myPanel.add(input);
		// 텍스트 필드에 "메세지를 입력하세요." 이라는 텍스트를 셋팅
		input.setText("메세지를 입력하세요.");
		// 패널의 남쪽에 input 놓기
		add("South", myPanel);
	}

	public void start() {
		if (clock == null) {
			clock = new Thread(this);
			clock.start();
		}
	}

	// ChatThread에서 start()하면 실행 됨
	public void run() {
		out.println("LOGIN|" + mySocket); // 스레드에서 start()하면 실행됨
		memo.append("[접속] " + getCodeBase().toString() + "\n"); //
		// 현재 애플릿 코드가 삽입되어 있는 html문서가 있는 경로까지만을 리턴한다

		try {
			// 무한루프 실행
			while (true) {
				// 소켓을 통해서 입력을 받아서 msg에 저장
				String msg = in.readLine();
				// 저장 받은것이 공백이 아니고 null값도 아니면
				if (!msg.equals("") && !msg.equals(null)) {
					// memo라는 텍스트에리어에 msg를 추가해라
					memo.append(msg + "\n");
				}
			}
		} catch (IOException e) {
			memo.append(e.toString() + "\n");
		}
	}

	// input에서 엔터를 치거나 마우스로 클릭하면 e로 전달된다.
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == input) {
			// input에 입력된 값을 가져와서 data에 저장하라
			String data = input.getText();
			// input은 공백으로 셋팅
			input.setText("");
			// TALK| 이름: 메세지 형식으로 out이라는 printwriter를 통해 서버에게 출력한다.
			out.println("TALK|" + name.getText() + ": " + data);
			// 출력스트림에 보내지지 않은 것을 모두 비움
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