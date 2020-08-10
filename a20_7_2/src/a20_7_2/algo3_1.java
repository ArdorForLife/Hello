package a20_7_2;

public class algo3_1 {

	public static void main(String[] args) {
		int n,h;
		n=0; h=0;
		do {
			n++;
			if(n%2==1) h=h+n*n;
		}while(n<99);
		System.out.println(h);
	}

}
