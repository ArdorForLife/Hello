package a20_7_7;
//���̳ʽ����� ã�Ƽ� minus[]�迭�� �ְ� �� �հ�� ����� ���϶�
public class aTest4 {
	public static void main(String[] args) {
		int jumsu[]= {100, 90, 80, 78, 56, -34, -90};
		int len=jumsu.length;
		int minus[]=new int[len];
		int i;
		int hap=0;
		double avg;
		int cn=0;
		
		for(i=0;i<len;i++) {
			if(jumsu[i]<0)
			{
				minus[cn]=jumsu[i];
				hap=hap+minus[cn];
				cn++;
			}
		}System.out.println(hap);
		avg=(double)hap/cn;
		System.out.println(avg);
	}

}
