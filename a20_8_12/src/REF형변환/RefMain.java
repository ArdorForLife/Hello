package REF����ȯ;

import javax.swing.JFrame;

public class RefMain {

	public static void call(Point temp) {
		if(temp instanceof Point3D) {
			Point3D p=(Point3D) temp;			//int a = (int) 10.5;   �ٿ�ĳ��Ʈ
			p.setX(10);							//�θ��� ���� ���� ������ temp�� point3D �ڽ������� ���ߴ� ����.
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
		Point p=new Point3D();					//�θ�Ŭ������ ��ü�� ���尡��(��ĳ��Ʈ)
		call(p);
		
		Point x=new Point();					//�ڱⰡ �ڱ���� ������ ��
		call(p);
		
		JFrame frame=new JFrame();
		frame.setVisible(true);
		frame.setTitle("����������");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(10, 30, 500, 500);
	}

}
