package a20_7_7;
//num�迭�� ��� ���� ����ϰ�
//num�迭�� ��� ���� ��(hap)�� ����Ͻÿ�
//���(avg)�� ���Ͻÿ�
public class aTest2 {
	public static void main(String[] args) {
		double num[]= {90.5, 88.5, 60, 75.0, 80.5};				//�迭�� ���� �ʹ� ������ ���� �ϳ��ϳ� �� ���� ��� ������ �������ֱ� �����. �̷� ���� �� ��ɾ �̿��Ѵ�. num.length
		int i=0;
		double hap=0;
		int len=num.length;
		do{
			System.out.println((i+1)+"��° ��="+num[i]);
			hap=hap+num[i];
			i++;
		}while(i<num.length);
	System.out.println("�հ�="+hap);
	System.out.println("avg="+(hap/len));
	
	}

}