package a20_7_9;

public class ch06ex01 {
	public static void sum() {								//sum method�� �������. static�� �����޸𸮿� �Է��϶�? �̷� ��. return ���� ���� ������ void�� ��. 
		System.out.println("�ҷ����");						//���� method�� ���� ����� ������ ������ method �̱� �����̴�.
		System.out.println("�ƴϸ� ����");
		System.out.println("���ư�����");
		
	}
	public static void line() {
		System.out.println("====================");
	}
	
	
	public static void main(String[] args) {
		line();												//line�� ������ �ҷ���
		sum();												//main method �ȿ��� �ٱ��� sum method�� ������ �ҷ���
		line();												//line�� ������ �ҷ���
		
	}
}
