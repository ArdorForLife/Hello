package a20_9_21_network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientText {

	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("192.168.0.6", 9000);				//"127.0.0.1"은 "localhost"로 바꿔적을수있기 때문에 문자열이라고 볼 수 있다
		
		//입력스트림
		BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		//출력스트림
		PrintWriter output = new PrintWriter(socket.getOutputStream());
		output.println("Hello teacher.");
		output.flush();
		
		String str = input.readLine();
		System.out.println(str);
	}

}
