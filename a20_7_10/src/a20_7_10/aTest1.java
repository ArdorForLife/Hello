package a20_7_10;
//�޼��� ���� -> void sum() {  }
//�޼��� ȣ�� -> sum();

//���ϰ��� ���� �޼��� ���� -> int sum() { return 0; }
//�޼��� ȣ�� -> int x=sum();

//�� ��(a,b)�� �޼���� ������ a���� b������ �հ�(hap)�� ����Ͻÿ�
public class aTest1 {
	
	public static int sum(int a, int b) {
		int i;
		int hap=0;
		for(i=a;i<=b;i++) {
			hap=hap+i;
		}
		return hap;
	}
	
	public static void main(String[] args) {
		int res=sum(10,50);
		System.out.println(res);
		
	}

}
