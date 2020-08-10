package a20_7_3;

public class ch05ex01 {

	public static void main(String[] args) {
		int i;
		for(i=1;i<=10;i++) {
			if(i%3==0) break;
			System.out.println(i);				//1 찍고 2 찍고 3의 배수가 되어버리면 바로 break; 로 밑의 sysout을 안찍고 반복문을 빠져나감
		}
		for(i=1;i<=10;i++) {
			if(i%3==0) continue;				//1 찍고 2 찍고 3의 배수가 되어버리면 바로 continue; 로 밑의 sysout을 안찍고 다시 if문으로 돌아감
			System.out.println(i);
		}
		
	}

}
