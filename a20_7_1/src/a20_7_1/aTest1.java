package a20_7_1;

public class aTest1 {

	public static void main(String[] args) {
		int a,b,c,d,e,max,min;
		a=10;b=30;c=20;d=45;e=80;
		max=min=a;
		
		if(b>max) max=b;
		if(c>max) max=c;
		if(d>max) max=d;
		if(e>max) max=e;
		System.out.println("최대값="+max);
		
		if(b<min) min=b;
		if(c<min) min=c;
		if(d<min) min=d;
		if(e<min) min=e;
		System.out.println("최소값="+min);
		
		
		
		
		//if(a>b) max=a;		//최대값을 구하는 변수의 모양 큰 것이 max에 들어가는
		//else max=b;			//반대로 a와 b의 자리를 바꾸면 최소값으로도 가능			
	}

}
