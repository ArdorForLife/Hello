import java.io.IOException;
import java.net.ServerSocket;
import java.util.Vector;

public class ChatServer2
{
	Vector clientVector = new Vector();
	int clientNum = 0;
	
	public void broadcast(String msg) throws IOException
	{
		synchronized(clientVector) {
			for(int i=0;i<clientVector.size();i++) { //접속한 클라이언트 수만큼
				ChatThread2 client = (ChatThread2) clientVector.elementAt(i);
					//모든 클라이언트에게 메시지 보냄
				synchronized(client) {
					client.sendMessage(msg);
				}
			}
		}
	}
	
	public void removeClient(ChatThread2 client)
	{
		synchronized(clientVector) {
			clientVector.removeElement(client);
			client = null;
			System.gc();	//가비지 콜렉션
		}
	}
	
	public void addClient(ChatThread2 client)
	{
		synchronized(clientVector) {
			clientVector.addElement(client);
		}
	}
	
	public static void main(String[] args)
	{
		ServerSocket myServerSocket = null;
		
		ChatServer2 myServer = new ChatServer2();		//1) 현재 ChatServer자체 생성하여 --> myServer 객체명으로 사용
		
		try {
			myServerSocket = new ServerSocket(2587);
		} catch (IOException e) {
			System.out.println(e.toString());
			System.exit(-1);
		}
		
		System.out.println("[서버 대기 상태] "+ myServerSocket);
			//3) 콘솔에 [서버 대기 상태] ServerSocket[addr = 0.0.0.1/0.0.0.0, port = 0, localport = 2587]

		
		//여기부터가 핵심임
		try {
			//서버는 무한루프 돌기
			while(true) {
				//myServer라는 서버와 myServerSocket.accept() 로 서버가 ChatThread에서 기다린다.
				ChatThread2 client = new ChatThread2(myServer, myServerSocket.accept());
					//(서버, 소캣)로 생성하여 --> client객체명
				//ChatThread 클래스의 run()메소드 실행함
				client.start();		//서버는 run()으로 실행하고, 클라이언트가 접속시 아래쪽 명령 수행
				//내 자신의 addClient 메소드 실행
				myServer.addClient(client);
				
				//내 자신의 클라이언트 넘버를 1씩 증가시킴
				myServer.clientNum++;
				//현재 접속자수 확인
				System.out.println("[현재 접속자수] "+ myServer.clientNum +"명");
			}
		}catch (IOException e) {;
			System.out.println(e.toString());
		}
  }
}
