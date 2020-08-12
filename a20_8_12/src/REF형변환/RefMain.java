package REF형변환;

import javax.swing.JFrame;

public class RefMain {

	public static void call(Point temp) {
		if(temp instanceof Point3D) {
			Point3D p=(Point3D) temp;			//int a = (int) 10.5;   다운캐스트
			p.setX(10);							//부모의 형이 높기 때문에 temp를 point3D 자식형으로 맞추는 과정.
			p.setY(20);
			p.setZ(30);
			p.show();
		}
		else {
			temp.setX(100);
			temp.setY(200);
			temp.show();
		}
		
	}
	
	public static void main(String[] args) {
		Point p=new Point3D();					//부모클래스의 객체에 저장가능(업캐스트)
		call(p);
		
		Point x=new Point();					//자기가 자기것을 가지는 것
		call(p);
		
		JFrame frame=new JFrame();
		frame.setVisible(true);
		frame.setTitle("연습프레임");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(10, 30, 500, 500);
	}

}
