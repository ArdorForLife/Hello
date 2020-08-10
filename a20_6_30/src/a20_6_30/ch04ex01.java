package a20_6_30;
//이름(name),국어(kor),수학(mat),영어(eng)
//입력받아서 이름과 총점(tot)와 평균(avg)를 구하시오
//평균이 60점 이상이고 모든 과목이 40점 이상이면 "합격" 아니면 "불합격"
import java.util.Scanner;

public class ch04ex01 {

	public static void main(String[] args) {
		String name;
		int kor,mat,eng,tot;
		double avg;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		name=sc.next();			//문자열 입력-int없이 next만
		System.out.println("국어,수학,영어 점수를 입력하세요");
		kor=sc.nextInt();		//정수 입력   -int있게
		mat=sc.nextInt();
		eng=sc.nextInt();
		
		tot=kor+mat+eng;
		avg=(double)tot/3;
		System.out.println(name);
		System.out.println(tot);
		System.out.println(avg);

		if(avg>=60 && kor>=40 && mat>=40 && eng>=40) System.out.println("합격");
		else System.out.println("불합격");
		
		//if(avg<60 || kor<40 || mat<40 || eng<40) System.out.printIn("불합격");
		//else System.out.printIn("합격");
		
		//if(avg>=60) if(kor>=40) if(mat>=40) if(eng>=40) <-위의 &&랑 같은 형식이라고 생각하면 됨
	}
}
