package a20_7_8;

public class ch06ex01 {
	public static void main(String[] args) {
		String a[]=new String[5];
		int i,cnt=0;
		
		a[0]="���ѹα�";
		a[1]="�Ϻ�";
		a[2]="�̱�";
		a[3]="�Ϻ�";
		
		String b[]=new String[5];
		
		for(i=0;i<4;i++) {
			if(a[i]!="�Ϻ�") {
				b[cnt]=a[i];
				cnt++;
			}
		}
		
		for(i=0;i<cnt;i++)
			System.out.println(b[i]);
	}

}
