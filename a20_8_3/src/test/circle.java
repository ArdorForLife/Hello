package test;

public class circle extends shape {
		protected int r;
		public void area() {
			res=(int) (r*r*Math.PI);
		}
		public circle() {}
		public circle(int r) {
			this.r=r;
		}
}

//overriding(������) : ��ӵ� �޼ҵ�� �ڽ� �޼ҵ尡 ������ ��
//�ڽ��� �޼ҵ�� �����ǵǴ� ��

//overloading : ������ �޼ҵ尡 ������ ���ǰ����� �� -> ���� �����ڸ޼ҵ� ���� ��
//��, �����μ��� �޶����(�����Ķ��Ÿ) -> ������ �޼ҵ忡 () �� (int r) ���� ��ó�� �޶�� ��