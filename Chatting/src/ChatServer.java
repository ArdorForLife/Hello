import java.io.IOException;
import java.net.ServerSocket;
import java.util.Vector;

public class ChatServer
{
	Vector clientVector = new Vector();
	int clientNum = 0;
	
	public void broadcast(String msg) throws IOException
	{
		synchronized(clientVector) {
			for(int i=0;i<clientVector.size();i++) { //접속한 클라이언트 수만큼
				ChatThread client = (ChatThread) clientVector.elementAt(i);
					//모든 클라이언트에게 메시지 보냄
				synchronized(client) {
					client.sendMessage(msg);
				}
			}
		}
	}
	
	public void removeClient(ChatThread client)
	{
		synchronized(clientVector) {
			clientVector.removeElement(client);
			client = null;
			System.gc();	//가비지 콜렉션
		}
	}
	
	public void addClient(ChatThread client)
	{
		synchronized(clientVector) {
			clientVector.addElement(client);
		}
	}
	
	public static void main(String[] args)
	{
		ServerSocket myServerSocket = null;
		
		ChatServer myServer = new ChatServer();		//1) 현재 ChatServer자체 생성하여 --> myServer 객체명으로 사용
		
		try {
			myServerSocket = new ServerSocket(2587);
		} catch (IOException e) {
			System.out.println(e.toString());
			System.exit(-1);
		}
		
		System.out.println("[서버 대기 상태] "+ myServerSocket);
			//3) 콘솔에 [서버 대기 상태] ServerSocket[addr = 0.0.0.1/0.0.0.0, port = 0, localport = 2587]
		
		try {
			while(true) {
				ChatThread client = new ChatThread(myServer, myServerSocket.accept());
					//(서버, 소캣)로 생성하여 --> client객체명
				client.start();		//서버는 run()으로 실행하고, 클라이언트가 접속시 아래쪽 명령 수행
				myServer.addClient(client);
				
				myServer.clientNum++;
				System.out.println("[현재 접속자수] "+ myServer.clientNum +"명");
			}
		}catch (IOException e) {;
			System.out.println(e.toString());
		}
  }
}
