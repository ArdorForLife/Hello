package a20_8_27;

class Outer1 {								//�ٱ�Ŭ����
	private int outdata = 100;				//�ٱ�Ŭ���� ������ ����
	public Object method() {				//�ٱ�Ŭ���� ������ �޼ҵ�
		final int data = 200;				//�ٱ�Ŭ���� �޼ҵ� ������ ����
		class Inner {						//�ٱ�Ŭ���� ������ �޼ҵ� ������ Ŭ����
			public String toString() {		//�ٱ�Ŭ���� ������ �޼ҵ� ������ Ŭ���� ������ �޼ҵ�
				return "���="+(outdata+data);
			}
		}
		return new Inner();					//�ٱ�Ŭ���� ������ �޼ҵ忡�� ����
	}
}

public class innterTest4 {
	public static void main(String[] args) {
		Outer1 out = new Outer1();
		Object obj = out.method();
		System.out.println(obj.toString());
	}

}
