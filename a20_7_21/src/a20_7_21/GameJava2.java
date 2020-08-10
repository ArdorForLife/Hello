package a20_7_21;

import java.util.Random;

public class GameJava2 {

	public static void main(String[] args) {
		Random r=new Random();
		int ran;
		for(int i=0;i<6;i++) {
			ran=Math.abs(r.nextInt()%45)+1;
			System.out.println(ran);
			
		}
		
	}

}
