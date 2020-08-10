package a20_7_3;

public class ch05Test3 {

	public static void main(String[] args) {
		int a,b;
		for(a=1;a<=7;a=a+3) {
			for(b=1;b<=9;b++) {
				System.out.print(a+"*"+b+"="+(a*b)+"\t");
				System.out.print((a+1)+"*"+b+"="+((a+1)*b)+"\t");
				System.out.println((a+2)+"*"+b+"="+((a+2)*b));
			}
			
			System.out.println();
		}
		
		
	}

}
