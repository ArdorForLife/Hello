package a20_7_1;

public class ch05ex03
{

	public static void main(String[] args)
	{
		int i=1;
		for(;;)									//무(無)조건의 for문이 됨. 무한반복됨
		{
			System.out.println("혼자돈다"); 		//컴퓨터 꺼질때까지 반복.
												//이런 상황은 server의 상황
			if(i>100) break;					//조건은 안에 넣고 100이 넘으면 break를 통해 밖으로 나간다 //break가 뭐냐면 반복문을 빠져나가라 임
			i++;								//초기값은 밖에 넣고 증감은 안에 넣고
												//for문법을 이런식으로도 사용 가능
		}
		
	}

}
