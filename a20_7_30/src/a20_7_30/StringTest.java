package a20_7_30;

class point extends Object {
	private int x,y;

	public point(int x, int y) {					//�ΰ�¥�� ������ �޼ҵ�
		super();
		this.x = x;
		this.y = y;
	}
	public point() {								//����Ʈ ������ �޼ҵ�
		super();
		// TODO Auto-generated constructor stub
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void show() {
		System.out.println(x+","+y);
	}
	@Override
	public boolean equals(Object obj) {
		point pt;
		if(obj instanceof point) {
			pt=(point) obj;
			if(pt.x==this.x && pt.y==this.y) return true;
		}
		return false;
	}
		
}

public class StringTest extends Object {			//extends Object �� �����Ǿ�����.

	public static void main(String[] args) {
		point kim=new point(10,20);
		point lee=new point(10,20);
		if(kim==lee) System.out.println("����");		//==�� �ּҰ� ���İ� ���� ��
		else System.out.println("�ٸ���");
		if(kim.equals(lee)) System.out.println("����");	//���İ� ���� �Լ��� equals				//sp�� ep�� ������ ���� equals�� �����Ѵ�
		else System.out.println("�ٸ���");
	}

}
