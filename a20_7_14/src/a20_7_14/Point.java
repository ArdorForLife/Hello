package a20_7_14;

public class Point {
	private int x,y;					//�������(���)�� �����				//�������
	public void show() {				//����޼ҵ�(������)�� ����
		System.out.println("x="+x);
		System.out.println("y="+y);
	}	
	public void setX(int x) {			//��������� �̸��� this.x, this.y��� �������ټ� �ִ�.
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void set(int x,int y) {		//2���� ������ �̸� ������ ����� �� �� ����. ���� ����־�� �Ѵ�.
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
}
