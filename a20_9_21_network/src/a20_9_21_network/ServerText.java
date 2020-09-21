package a20_9_21_network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerText {

	public static void main(String[] args) throws Exception {
		//����
		
		ServerSocket ss = new ServerSocket(9000);
		Socket socket = ss.accept();
		
		//�Է½�Ʈ��
		BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		//��½�Ʈ��
		PrintWriter output = new PrintWriter(socket.getOutputStream());
		//BufferedWriter output = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		
		String str = input.readLine();
		//System.out.println(str);
		
		output.println("I'm server. Hello client.");
		output.flush();
		
		socket.close();
		ss.close();
	}

}
