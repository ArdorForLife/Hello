package a20_7_1;

public class aTest1 {

	public static void main(String[] args) {
		int a,b,c,d,e,max,min;
		a=10;b=30;c=20;d=45;e=80;
		max=min=a;
		
		if(b>max) max=b;
		if(c>max) max=c;
		if(d>max) max=d;
		if(e>max) max=e;
		System.out.println("�ִ밪="+max);
		
		if(b<min) min=b;
		if(c<min) min=c;
		if(d<min) min=d;
		if(e<min) min=e;
		System.out.println("�ּҰ�="+min);
		
		
		
		
		//if(a>b) max=a;		//�ִ밪�� ���ϴ� ������ ��� ū ���� max�� ����
		//else max=b;			//�ݴ�� a�� b�� �ڸ��� �ٲٸ� �ּҰ����ε� ����			
	}

}
