package a20_6_25;
public class ch02ex01 {
	public static void main(String[] args) {
		int kor,eng,mat,tot;  //정수형(소수점 없음)
		double avg;			  //실수형(소수점이 있는 것)
		kor=100;
		eng=100;
		mat=90;
		tot=kor+eng+mat; 	  //
		avg=tot/3.0;		  //tot를 3으로 나누면 정수와 정수의 나눗셈이라서 96으로 나누어떨어지게밖에 표현 못함. 그래서 3.0으로 실수형으로 표시해주면 값이 정확하게 96.6666666...으로 나옴
		System.out.println(avg);
	}
}
