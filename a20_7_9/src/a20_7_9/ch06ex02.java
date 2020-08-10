package a20_7_9;

//정수를 입력하여 정수가 음수이면 -1을 리턴하고, 양수이면 1을 리턴하고, 0이면 0을 리턴해라

//정수를 입력하여 정수가 음수이면 "음수", 양수이면 "양수", 0이면 0출력
//하는 sign()메서드 만들기
public class ch06ex02 {

	public static int sign(int a) {
		int res=0;
		if(a>0) res=1;
		else if(a<0) res=-1;
		return res;
	}
	
	public static void main(String[] args) {		//main method와 위의 sign method의 변수 a는 서로 다른것이다. 헷갈리면 안됨. 궁금하면 위와 아래의 a를 서로 다른것으로 바꾸어봐도 똑같은 결과가 나옴.
		int a=-10;									//조금만 생각해보면 다르다는것을 알게 됨.
		System.out.println(sign(a));				//여기에서의 sign() 메서드 안의 값은 -10 인데 그러면 위의 sign의 a변수 값에 -10을 넣고 그러면 그때 결과는 음수이므로 -1이 나온다. 
		System.out.println(sign(-40));				//그래서 -1이라는 값을 return으로 다시 돌려주게 되어서 sign(a)의 값이 -1이 되고 그것을 출력한다.
		System.out.println(sign(0));				//sign의 값을 위로 전달하고 거기서 계산된 값을 다시 밑으로 내려주는 구조이다.
	}

}
