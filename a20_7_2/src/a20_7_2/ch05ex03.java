package a20_7_2;
//1부터 100까지(a) 합계(hap)를 구하시오
//
public class ch05ex03 {

	public static void main(String[] args) {
		int a, hap;
		a=1;
		hap=0;
		do {							//while의 조건이 true이면 do 옆의 중괄호를 돌고 아니면 빠져나옴
			System.out.println(a);
			hap=hap+a;
			a++;
		}while(a<=100);					//while반복문과 do while반복문의 차이는 처음 1번을 실행해보느냐 아니냐의 차이
										//while은 조건에 따라 횟수가 1번도 수행하지 않을 수도 있다
										//do while은 조건에 따라 횟수가 최소 1번은 수행한다
										//따라서 while은 0회 이상 수행, do while은 1회 이상 수행
										//주로 while을 쓰지만 꼭 1번은 하긴 해야하는 상황이면 do while을 씀
		System.out.println("합계="+hap);
	}

}
