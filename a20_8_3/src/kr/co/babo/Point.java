package kr.co.babo;							//kr ���� co ���� babo�� ����ȴٴ� ��

public class Point {
	private int x,y;
	public Point() {	}					//����Ʈ ������
	public Point(int x, int y) {			//2��¥�� ������
		this.x=x;
		this.y=y;
	}
	public void setX(int x) {				//��������� ���� �����ϱ� ���� setter
		this.x=x;
	}
	public void setY(int y) {
		this.y=y;
	}
	
	public int getX() {						//���� return �ϱ� ���� getter this�� ��� ��
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	
	public void show() {
		System.out.println(x+","+y);
	}
}