package a20_7_14;

public class atest2 {
	public static void main(String[] args) {
		Point p=new Point();
		//p.x=10;									//������ �����ߴµ� �� �ȵ���? point class�� x,y���� private�� �����Ǿ��� ������ ����� �� ����. ���� ��Ű�� �ȿ����� ��밡��.
		//p.y=20;
		//p.show();									//�̰Ŵ� �� �����ұ�. show�޼ҵ�� public�̱� ������. �ٵ� ����ϸ� ���� 0���� ���´�. ����ؾ��ұ�? x,y���� �������ټ��� ���� �ǹ��ȴ�. �׷� ���?
		p.setX(10);									//10�� a�� �Է��ؼ� �ٽ� x�� ����
		p.setY(20);									//20�� b�� �Է��ؼ� �ٽ� y�� ����		//setX,setY set�� ���� ��� �θ��� ��.
		p.show();									
		
		p.set(100,200);								//���ÿ� �ΰ� �� �ٲٰ� ������ �̷��� set�� ���ش�.
		p.show();									//Point�� setX(int x) {x=x;} �̷������� �ϸ� ó���� int x�� 10�� �Էµǰ� 10�� �ٽ� ������ x�� �Էµȴ�.
													//�ٵ� �� x�� �� ���� show()�� ����? �ƴ�! ���� ����� x�� ���⶧���� �� ���� ����.
													//�׷���!! � ����� ����? setX(int x) {this.x=x;} ���� �����شٸ�
		System.out.println(p.getX()+p.getY());		//�׳� p.getX(); p.getY(); �ϸ� �ȵȴ�. ���� �����ͼ� sysout ������Ѵ�. �ٷ� ������ p.set(100,200)�� �Ǿ��ֱ� ������ ���� 300�� ���´�.
	}
}