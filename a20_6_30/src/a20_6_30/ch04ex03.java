package a20_6_30;
//평균을 구하고, 평균이 90이상이면 "A학점"
//평균이 80이상이면 "B학점"
//평균이 70이상이면 "C학점"
//평균이 60이상이면 "D학점"
//그 외 "F학점"
public class ch04ex03 {

	public static void main(String[] args) {
		int kor=100,mat=60,eng=65;
		int avg;
		avg=(kor+mat+eng)/3;
		
		switch (avg/10) {					//switch안의 괄호에 조건식이 들어가야하는 것은 맞으나 등호가 들어가는 부정식은 사용할 수 없다. 그냥 정수 식이어야 한다.그래서 그냥 (avg) 하고 밑의 case에 100,99,98,97... 이런식으로 하나하나 직접 입력해야 함
		case 10:							//그래서 바꾼다. avg/10으로 바꿔서 정수 몫으로 보는것으로 하면 간편해진다
		case 9:								//case 10: 으로만 적은것은 저 계산 값이 나오면 어차피 A학점이어서 그냥 그대로 흘러내리면 되기 때문에 sysout과 break를 하지 않았다.
			System.out.println("A학점"); 	break;
		case 8:	System.out.println("B학점"); 	break;
		case 7: System.out.println("C학점"); 	break;
		case 6:	System.out.println("D학점"); 	break;
		default: System.out.println("F학점"); //가장 마지막에는 break;를 안 써도 되긴 한다.
		}
		
		
	}

}
