package a20_7_13;

public class ch07ex02 {

	public static void main(String[] args) {
		성적 kim=new 성적();					//오른쪽부터 읽는다. 성적() 클래스를 새롭게 만든다. 그 성적의 객체는 kim씨 이다.
											//new 성적() 하는순간 메모리가 성적에 적힌대로 잡힌다. 국어,영어,수학,총점 4byte 총점 8byte 학점 2byte로 잡힌다. 그 밑에 구하기구하기... 잡히는데 그게 뭐다? kim이다.
		
		//Scanner sc=new Scanner(System.in); 이걸로 점수 입력해도 됨
		
		kim.국어=100;
		kim.영어=90;
		kim.수학=80;
		kim.총점구하기();
		kim.평균구하기();
		kim.학점구하기();
		kim.출력();
	}

}
