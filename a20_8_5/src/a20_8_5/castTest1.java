package a20_8_5;

class Point2D {
	public int x,y;
	public void show() {
		System.out.println("2d쇼");
		
	}
}

class Point3D extends Point2D {
	public int z;
	public void show() {
		System.out.println("3d쇼");
	}
}

public class castTest1 {

	public static void main(String[] args) {
		Point3D pt=new Point3D();
		Point2D up=pt;								//pt보다 up이 더 크기 때문에 가능
		System.out.println(up.x);
		System.out.println(up.y);
		//System.out.println(up.z);					//상속 해준 슈퍼클래스라고 하더라도 서브클래스의 매개변수를 사용할 순 없다
		up.show();									
		
	}

}
