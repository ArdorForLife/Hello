package a20_8_5;


class A {
	
}

class B extends A {
	
}

public class C {
	public static C getC() {					//�� �ڽ�(C)�� ��üȭ�ϴ� �Ǵٸ� ���.
		return new C();
	}
	
	public static void main(String[] args) {
		A kim=new A();		
		B bkim=new B();							//B��� Ŭ������ ��ü�� b��� ����ؼ� ������. BŬ������ ��ü �ڷᰡ �� b�� �Դٰ� �����ؾ��Ѵ�.
		C ckim=new C();							//�� �ڽ�(C)�� ��üȭ�� �ȴ�. �׳� �Ҽ��ִ�					
		C cpark=getC();							//13line�� getC�� ���°�. �� ����� 20line���� ����� ���
		
	}

	
}
