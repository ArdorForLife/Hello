package a20_7_8;

public class ch06ex01 {
	public static void main(String[] args) {
		String a[]=new String[5];
		int i,cnt=0;
		
		a[0]="대한민국";
		a[1]="일본";
		a[2]="미국";
		a[3]="일본";
		
		String b[]=new String[5];
		
		for(i=0;i<4;i++) {
			if(a[i]!="일본") {
				b[cnt]=a[i];
				cnt++;
			}
		}
		
		for(i=0;i<cnt;i++)
			System.out.println(b[i]);
	}

}
