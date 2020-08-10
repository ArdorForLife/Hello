package a20_7_3;

public class algo8_1 {

	public static void main(String[] args) {
		double i=0,h=0;				//ALGO식으로 하면 int 정수형이면 0이기 때문에 double으로 해야한다.
		do {
			i++;
			h=h+(i/(i+1));
			
		}while(i<49);
		System.out.println(h);
	}

}
