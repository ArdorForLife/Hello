
public class Circle extends Shape {

	
	private int r; 
	
	public void draw() {					//�߻�޼ҵ带 ���� �س����� ��ӹ��� �ڽ��� �����ؾ��Ѵ�. �ƹ��͵� �������� �ʴ´ٰ� �ϴ��� �� �޼ҵ�� ����� ������ ���.
	}
	public void area() {
		res=r*r*Math.PI;
	}
	public void show() {
		System.out.println("������="+res);
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	
	
}
