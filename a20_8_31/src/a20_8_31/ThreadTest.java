package a20_8_31;

class mythread extends Thread{

	int num=0;
	String name;
	
	public mythread() {}
	public mythread(String name) {
		this.name=name;
	}
	
	public void run() {
		while(true) {
			System.out.println(name+"="+num);
			num++;
			try {
				sleep(1000);				//1000�� ��� 1����. 1�� 1ms��
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 	
		}
	}
	
}


public class ThreadTest {

	public static void main(String[] args) {
		mythread kim = new mythread("��浿");
		kim.start();
		
		mythread lee = new mythread("�̼���");
		lee.start();
		
		mythread park = new mythread("�ڸ���");
		park.setPriority(Thread.MAX_PRIORITY);
		park.start();
	}

}
