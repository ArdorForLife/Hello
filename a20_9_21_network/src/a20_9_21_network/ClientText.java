package a20_9_21_network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientText {

	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("192.168.0.6", 9000);				//"127.0.0.1"�� "localhost"�� �ٲ��������ֱ� ������ ���ڿ��̶�� �� �� �ִ�
		
		//�Է½�Ʈ��
		BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		//��½�Ʈ��
		PrintWriter output = new PrintWriter(socket.getOutputStream());
		output.println("Hello teacher.");
		output.flush();
		
		String str = input.readLine();
		System.out.println(str);
	}

}
