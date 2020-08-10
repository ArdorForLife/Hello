package a20_7_2;

public class algo4_1 {

	public static void main(String[] args) {
		int n,h;
		n=0; h=0;
		do {
			n++;
			if(n%2==1) h=h+n;
			else h=h-n;
		}while(n<100);
		System.out.println(h);
		
	}

}
