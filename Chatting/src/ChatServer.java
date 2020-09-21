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
			for(int i=0;i<clientVector.size();i++) { //������ Ŭ���̾�Ʈ ����ŭ
				ChatThread client = (ChatThread) clientVector.elementAt(i);
					//��� Ŭ���̾�Ʈ���� �޽��� ����
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
			System.gc();	//������ �ݷ���
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
		
		ChatServer myServer = new ChatServer();		//1) ���� ChatServer��ü �����Ͽ� --> myServer ��ü������ ���
		
		try {
			myServerSocket = new ServerSocket(2587);
		} catch (IOException e) {
			System.out.println(e.toString());
			System.exit(-1);
		}
		
		System.out.println("[���� ��� ����] "+ myServerSocket);
			//3) �ֿܼ� [���� ��� ����] ServerSocket[addr = 0.0.0.1/0.0.0.0, port = 0, localport = 2587]
		
		try {
			while(true) {
				ChatThread client = new ChatThread(myServer, myServerSocket.accept());
					//(����, ��Ĺ)�� �����Ͽ� --> client��ü��
				client.start();		//������ run()���� �����ϰ�, Ŭ���̾�Ʈ�� ���ӽ� �Ʒ��� ��� ����
				myServer.addClient(client);
				
				myServer.clientNum++;
				System.out.println("[���� �����ڼ�] "+ myServer.clientNum +"��");
			}
		}catch (IOException e) {;
			System.out.println(e.toString());
		}
  }
}
