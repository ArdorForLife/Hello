//����� �Ǿ �ؾ�Ʋ,����,��,show(),�����(),�����ڵ���� �� ��ӵ�.
//�̶� show()ó�� ��ӵ� �޼ҵ�� �ڽ��� �޼ҵ尡 �����Ҷ��� �ڽ��� ���� ����ȴ�. -> ������(overriding)�̶�� �Ѵ�.
public class ����� extends �ؾ {
	private int ���Ʋ;
	private int ���;
	public void show() {
		System.out.println(���Ʋ);
	}
	public void �����2() {
		���Ʋ=����+���+����;
	}
	public �����() {
		System.out.println("�ȳ� �����(�ڽ�)");
	}
	public �����(int ���, int ����) {
		this.���=���;
		this.����=����;
	}
}
