import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.StringTokenizer;

public class ChatThread2 extends Thread 
	{
		ChatServer2 myServer;
		Socket mySocket;
		
		PrintWriter out;
		BufferedReader in;
		
		public ChatThread2(ChatServer2 server, Socket socket) //
		{
			super("ChatThread");
			
			myServer = server;
			mySocket = socket;
			
			out = null;
			in = null;
		}
		
		public void sendMessage(String msg) throws IOException
		{
			out.println(msg);
			out.flush();
		}
		
		public void disconnect()
		{
			try {
				out.flush();
				in.close();
				out.close();
				mySocket.close();
				myServer.removeClient(this);
			} catch (IOException e) {
				System.out.println(e.toString());
			}
		}
		
		public void run()
		{
			try {
				out = new PrintWriter(new OutputStreamWriter(mySocket.getOutputStream(), "KSC5601"), true);
				in = new BufferedReader(new InputStreamReader(mySocket.getInputStream(), "KSC5691"), 1024);
				
				while(true) {
					String inLine = in.readLine();
					if(!inLine.equals("") && !inLine.equals(null)) {
						messageProcess(inLine);
				}
			}
		}catch (Exception e) {
			disconnect();
			}
		}
	
		public void messageProcess(String msg)
		{
			System.out.println(msg);	//클라이언트가 보냄 LOGIN| Socket[address=/..]
			
			StringTokenizer st = new StringTokenizer(msg, "|");
			String command = st.nextToken();
			String talk = st.nextToken();
			
			if(command.equals("LOGIN")) {
				System.out.println("[접속] "+ mySocket);
				try {
					myServer.broadcast("[현재 접속자수] "+ myServer.clientNum +"명");
				} catch (IOException e) {
					System.out.println(e.toString());
				}
			}else if(command.equals("LOGOUT")) {
				try {
					myServer.clientNum--;
					myServer.broadcast("[접속 종료] "+ talk);
					myServer.broadcast("[현재 접속자수] "+ myServer.clientNum +"명");
				} catch(IOException e) {
					System.out.println(e.toString());
				}
				disconnect();
			}else {
				try {
					myServer.broadcast(talk);
				} catch (IOException e) {
					System.out.println(e.toString());
				}
			}
	}
}