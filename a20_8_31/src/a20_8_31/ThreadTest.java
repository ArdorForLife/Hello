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
				sleep(1000);				//1000을 줘야 1초임. 1은 1ms임
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 	
		}
	}
	
}


public class ThreadTest {

	public static void main(String[] args) {
		mythread kim = new mythread("김길동");
		kim.start();
		
		mythread lee = new mythread("이순자");
		lee.start();
		
		mythread park = new mythread("박말자");
		park.setPriority(Thread.MAX_PRIORITY);
		park.start();
	}

}
