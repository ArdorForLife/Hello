
public class abMain {

	
	public static void main(String[] args) {
		 //Shape a = new Shape();				//X �߻�Ŭ������ new�� �ȵȴ�.
		Circle c = new Circle();				// Shape c = new Circle(); �� �ص� �����ϴ�. �߻�Ŭ���� �̱������� �׷��� �θ�Ŭ������ �θ�Ŭ������ �׷��� �ص� �ȴ�.
		Rectangle r = new Rectangle();			// �ٸ� Shape Ŭ������ setR �̷� �༮���� ���ǰ� �ȵǾ��־ �ᱹ ������ ����.
		Triangle t = new Triangle();			// �߻� Ŭ������ �̷������� ���� ������ �� ���ɼ��� ����.
		
		new call(c);
		new call(r);
		new call(t);
		
		/*call(c);								//Shape temp = c; �� ����. �ٷ� ������ ���ǵ� c��� �༮�� Shape Ŭ������ temp�濡 �ִ°Ͱ� ������.(��ĳ��Ʈ)
		call(r);								//shape temp = r; �� ����. �ٷ� ������ ���ǵ� r�̶�� �༮�� Shape Ŭ������ temp�濡 �ִ°Ͱ� ������.(��ĳ��Ʈ)
		call(t);*/								//��
		
		/*c.setR(10);
		c.area();
		c.show();
		
		r.setW(5);
		r.setH(6);
		r.area();
		r.show();
		
		t.setW(5);
		t.setH(6);
		t.area();
		t.show();*/
		
		
	}

}
