package a20_7_2;

public class ch05ex02 {

	public static void main(String[] args) {
		int i;
		i=1;
		while(true) {					//true이면 반복하는 while문법이기 때문에 무한반복된다. for(;;)와 같음. server
			System.out.println(i);
			if(i>=10) break;			//break는 가장 가까운 반복문을 빠져나가게 함.
			i++;
		}
	}

}
