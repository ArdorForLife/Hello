package a20_8_5;

class Point2D {
	public int x,y;
	public void show() {
		System.out.println("2d��");
		
	}
}

class Point3D extends Point2D {
	public int z;
	public void show() {
		System.out.println("3d��");
	}
}

public class castTest1 {

	public static void main(String[] args) {
		Point3D pt=new Point3D();
		Point2D up=pt;								//pt���� up�� �� ũ�� ������ ����
		System.out.println(up.x);
		System.out.println(up.y);
		//System.out.println(up.z);					//��� ���� ����Ŭ������� �ϴ��� ����Ŭ������ �Ű������� ����� �� ����
		up.show();									
		
	}

}