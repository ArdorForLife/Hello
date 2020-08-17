
public class call {
	public call() { 	}							//default 생성자
	public call(Shape temp) {						//1개짜리 생성자
													//c,r,t를 어느것을 temp에 던져도 temp는 다 받아주고 그것을 부모클래스에 던져줘야하기 때문에 Shape에 보냄--> 업캐스트인 상황
		if(temp instanceof Circle) {				//그래서 다시 다운캐스트를 시켜줘야한다.
			Circle cc = (Circle) temp;				//temp방에 있는 것을 circle에 맞게 다운캐스트 시켜주는 것
			cc.setR(5);							
			cc.area();
			cc.show();
		}
		else if(temp instanceof Rectangle) {
			Rectangle rr = (Rectangle) temp;
			rr.setW(5);
			rr.setH(6);
			rr.area();
			rr.show();
		}
		else if(temp instanceof Triangle) {
			Triangle tt = (Triangle) temp;
			tt.setW(5);
			tt.setH(6);
			tt.area();
			tt.show();
		}
		
	}
}

