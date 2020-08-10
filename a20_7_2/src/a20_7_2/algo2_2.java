package a20_7_2;

public class algo2_2 {

	public static void main(String[] args) {
		int i,sum;
		i=0; sum=0;
		do {
			i++;
			if(i%2==0) sum=sum+i; 
		}while(i<100);
		System.out.println(sum);
		
	}

}
