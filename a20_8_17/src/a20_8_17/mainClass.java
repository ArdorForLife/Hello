package a20_8_17;

//�������̽��� Ŭ������ �����ϰ� ��������� ����޼ҵ�� ������ �����̴�.
//�ڹٴ� ���ϻ�Ӹ� �����ϴ�. �̷� ������ �����ϰ� ���� �������̽��� ���Դ�.
//�������̽��� �ڽ�Ŭ�������� ������ִ� ���Ҹ� �Ѵ�.
//�����δ� �ƹ��ϵ� �� �� ���� new�� �������� �ʴ´�.

//�������̽�����
//��������� public static final ������ ������.
//����޼ҵ�� public abstract ������ ������ �� ���� �����ϰ� �ڽ��� �������̵��Ͽ� ����Ͽ��� �Ѵ�.

//class A {}
//class B {}
//class C extends A, b {}     (X) extends�ڿ��� ģ�θ� 1���� �´�
//class D extends B {}		  (O)

//interface X {}
//class Y extends X {}		  (X) �������̽��� extends�� ���� �ȵȴ� ���� ����
//class Y implements X {}	  (O) 

//class Z extends A implements X	(O)
class childTest implements interTest{					//interface�� implements�� ��ӹ޴´�.
	public void draw() {
		
	}					
	
}

public class mainClass {

	public static void main(String[] args) {
		//new interTest();								//�̰��� �ȵ�.
	}

}
