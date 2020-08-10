package a20_7_2;

public class algo3_2 {

	public static void main(String[] args) {
		int n,h,sw;
		n=0; h=0; sw=0;
		do {
			n++;
			switch (sw) {
			case 0:
				h=h+n*n;
				sw=1;
				break;

			default:sw=0;
				break;
			}
		}while(n<99);
		System.out.println(h);
	}

}
