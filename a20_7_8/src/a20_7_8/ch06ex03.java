package a20_7_8;
//��ü �迭�� �հ�� ����� ���Ͻÿ�
public class ch06ex03 {
	public static void main(String[] args) {
		int a[]= {90,88,77,67,89,54,99,30};
		int len=a.length;
		int i;
		int hap=0;
		for(i=0;i<len;i++) {
			hap=hap+a[i];
		}
		double avg=hap/len;
		System.out.println("�հ�="+hap);
		System.out.println("���="+avg);
		
	}
}