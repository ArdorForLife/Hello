package a20_7_15;

public class �� {
	private String dog_name;
	private int dog_age;
	public void show() {
		System.out.println("������ �̸�="+dog_name);
		System.out.println("������ ����="+dog_age);
	}
	public void setDog_name(String dog_name) {
		this.dog_name=dog_name;
	}
	public void setDog_age(int dog_age) {
		this.dog_age=dog_age;
	}
	//������ �޼ҵ� �����
	public ��() {								//����Ʈ ������ �޼ҵ�
		dog_name="";							//�� �ٰ� ���� ���� ���� �ʾƵ� ������� 0�� ������ �׷��� �������ʹ� �����ֵ��� ����.
		dog_age=0;
	}
	public ��(String dog_name) {					//1��¥�� ������ �޼ҵ�		
		this.dog_name=dog_name;					//������ �޼ҵ嵵 �����ε��� �ȴ�!!
	}
	public ��(String dog_name,int dog_age) {		//2��¥�� ������ �޼ҵ�
		this.dog_name=dog_name;
		this.dog_age=dog_age;
	}
}
