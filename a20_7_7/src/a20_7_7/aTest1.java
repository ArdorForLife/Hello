package a20_7_7;
//
public class aTest1 {
	public static void main(String[] args) {
		String name1="홍길동";
		String name2="이순자";
		String name3="최고야";
		
		String name[]=new String[3];					//1) 1번 방법을 이용하면 각 네임의 0,1,2 방에 해당하는 값이 무엇인지 아래처럼 지정해줘야한다.
		name[0]="홍길동";
		name[1]="이순자";
		name[2]="최고야";
		
		String namex[]= {"홍길동","이순자","최고야"};			//2) 오른쪽에 3개가 나열되어 있기 때문에 방의 갯수는 3개로 잡혀버린다. 그리고 0,1,2 첨자도 순서대로 지정이 된다.
		
		int a[]=new int[3];
		a[0]=10; a[1]=20; a[2]=30;
		
		int ax[]= {10,20,30};
		
		
		
	}

}
