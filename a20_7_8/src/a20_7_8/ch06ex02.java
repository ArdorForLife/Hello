package a20_7_8;
//�迭�� ����� ���� ���� ū���� max�� ������ �� max�� ����϶�
//int a[]={90,88,77,67,89,54,99,30};
//�迭�� ����� ���� ���� ���� ���� min�� ������ �� min�� ����϶�
public class ch06ex02 {
	public static void main(String[] args) {
		int a[]={90,88,77,67,89,54,99,30};
		int len=a.length;					//len=8
		int i;
		//int max=0;						//max ������ ���� ���� ���� �־�д�.
		//int min=9999;						//min ������ ū ���� �־�д�.
		int max,min;
		max=min=a[0];						//���� �� �������� �����ϴ°ͺ��� �ڱ�鳢�� ���ϰ� ��Ű�°� ���� ����̴�.
		
		for(i=0;i<len;i++) {
			if(a[i]>max) max=a[i];
			if(a[i]<min) min=a[i];
		}
		System.out.println("�ּҰ�="+min);
		System.out.println("�ִ밪="+max);
	}
}