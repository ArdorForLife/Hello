package a20_8_31;

class mythread3 implements Runnable {		//runnable�� run�� �����ϱ� ���� �������̽���

	int num=0;
	String name;
	
	public mythread3(String name) {
		this.name=name;
	}
	public mythread3() {}
	
	public void run() {
		while(true) {
			System.out.println(name+"="+num);
			num++;
			try {
				Thread.sleep(1000);			//runnable�� ������� �ƴ϶� thread.����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
	}
	
}


public class ThreadTest3 {

	public static void main(String[] args) {
		mythread3 kim = new mythread3("��浿");
		Thread th = new Thread(kim);
		th.start();
		
		mythread3 lee = new mythread3("�̼���");
		Thread th2 = new Thread(lee);
		th2.start();
		
		mythread3 park = new mythread3("�ڸ���");
		Thread th3 = new Thread(park);
		th3.start();
	}

}
