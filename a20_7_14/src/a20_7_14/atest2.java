package a20_7_14;

public class atest2 {
	public static void main(String[] args) {
		Point p=new Point();
		//p.x=10;									//원래는 가능했는데 왜 안되지? point class의 x,y값이 private로 지정되었기 때문에 사용할 수 없음. 같은 패키지 안에서만 사용가능.
		//p.y=20;
		//p.show();									//이거는 왜 가능할까. show메소드는 public이기 때문에. 근데 출력하면 값이 0으로 나온다. 어떻게해야할까? x,y값을 지정해줄수는 없게 되버렸다. 그럼 어떻게?
		p.setX(10);									//10을 a에 입력해서 다시 x에 저장
		p.setY(20);									//20을 b에 입력해서 다시 y에 저장		//setX,setY set을 세터 라고 부르면 됨.
		p.show();									
		
		p.set(100,200);								//동시에 두개 다 바꾸고 싶으면 이렇게 set을 해준다.
		p.show();									//Point에 setX(int x) {x=x;} 이런식으로 하면 처음에 int x에 10이 입력되고 10이 다시 왼쪽의 x에 입력된다.
													//근데 그 x가 그 위의 show()로 갈까? 아니! 가장 가까운 x로 가기때문에 저 위로 간다.
													//그래서!! 어떤 방법을 쓰냐? setX(int x) {this.x=x;} 으로 적어준다면
		System.out.println(p.getX()+p.getY());		//그냥 p.getX(); p.getY(); 하면 안된다. 값을 가져와서 sysout 해줘야한다. 바로 위에서 p.set(100,200)이 되어있기 때문에 답은 300이 나온다.
	}
}
