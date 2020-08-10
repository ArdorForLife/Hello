package a20_7_9;

public class aTest1 {
	public static void main(String[] args) {
		//int [][]a=new int[3][];				//이거나 아래나 상관없음
		//int a[][]=new int[3][4];				
		int a[][]=new int[3][];					//행의 개수 3개, 열의 개수 없음
		a[0]=new int[2];						//0행은 2열까지 있음(3,4열 없음)
		a[1]=new int[3];						//1행은 3열까지 있음(4열 없음)
		a[2]=new int[4];						//2행은 4열까지 있음(다 있음)
		
		System.out.println(a.length);			//3  a배열의 행의 갯수
		System.out.println(a[0].length);		//2  a배열의 0행의 열(칸)의 갯수
		System.out.println(a[1].length);		//3  a배열의 1행의 열(칸)의 갯수
		System.out.println(a[2].length);		//4  a배열의 2행의 열(칸)의 갯수
		//java는 융통성이 있어서 한 행마다 열의 갯수를 따로 지정해줄 수 있음. c언어는 불가능함.
		
		
	}
	

}
