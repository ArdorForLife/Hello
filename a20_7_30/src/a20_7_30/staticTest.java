package a20_7_30;

import java.util.Date;

//���� �� �Ǵ� �޼ҵ� �� �Ǵ� Ŭ���� �տ� ���� �� �ִ�.
//1)�Ϲ������δ� ������ �޼ҵ� �տ� �ٿ��� �����޸𸮿� �����Ų��.
//2)static ���·� ����� �͵��� ���α׷� ���������� ��� ����ִ�.
//3)�������� ���� �����̴�.
//4)Ŭ�������� ���ؼ� �ٷ� ���ٰ����ϴ�.(�� new�� �������� �ʰ�)

class point3
{
	public static int x;
	public int y;
	public void cal() 
	{
		x=x+10;
		y=y+10;
		System.out.println("x="+x  +  ",y="+y);
	}
	public static void test() {
		System.out.println(x);
		//System.out.println(y); 	�ȵȴ�.
	}
}

public class staticTest {
	public static void main(String[] args) {
		point3.x=5;									//x�� static�̱� ������ ������. point3.y=3; �̷��Ŵ� �ȵ�. static�� �ƴϱ� ������.
		point3 park=new point3();
		park.cal();
		
		point3 kim=new point3();
		kim.cal();
		
		point3 lee=new point3();
		lee.cal();
		
		System.out.println(point3.x);	//Ŭ�������� ���� �ٷ� ���� ����			
		point3.test();					//Ŭ�������� ���� �ٷ� ���� ����
		
		Date now=new Date();
		System.out.println(now.toString());		//�̰� ������
		System.out.println(now);					//�̷��� �ص� ������ ��
	}

}
