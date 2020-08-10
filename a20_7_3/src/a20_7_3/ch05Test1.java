package a20_7_3;
/*
 |
 *
 **
 ***
 ****
 *****
 ******
 ******
 ******
 |
 **/
public class ch05Test1 {

	public static void main(String[] args) {
		int a,b;
		for(a=1;a<=8;a++) {
			for(b=1;b<=a;b++) {
				System.out.print("*");
				if(b>=6) break; 		//선생님 방식
										//내 방식 if(b<=6)	System.out.print("*");
			}
			
			System.out.println();
		}
		
	}

}
