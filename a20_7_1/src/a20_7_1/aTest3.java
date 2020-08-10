package a20_7_1;

public class aTest3 {

	public static void main(String[] args) {
		int k,cn=0,sum=0;
		for(k=1;k<=100;k++)				//for문 문법 - 초기값, 세미콜론, 조건, 세미콜론, 증가 혹은 감소치
		{								//for문법이 true이면 중괄호 안이 출력되고 다시 for문법이 반복된다
										//몇번 반복되는지 알고싶으면 이런식으로 0부터 시작하는 초기값을 잡고 1씩증가하는 값을 중괄호에 넣어주고 중괄호 밖에서 확인해야함
			System.out.println(k);
			sum+=k;						//for문 하면서 각 k의 값을 다 더하는 것
			
			
			
		}
		System.out.println(sum);
	}

}
