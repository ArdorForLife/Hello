package a20_7_2;

public class algo4_2 {

	public static void main(String[] args) {
		int n,h,sw;
		n=0; h=0; sw=0;
		do {
			n++;
			if(sw==0) {h=h+n; sw=1;}
			else {h=h-n; sw=0;}
		}while(n<100);
		System.out.println(h);
	}
	

}
