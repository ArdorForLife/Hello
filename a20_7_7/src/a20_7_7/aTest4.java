package a20_7_7;
//마이너스값을 찾아서 minus[]배열에 넣고 그 합계와 평균을 구하라
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
