import kr.co.babo.*;						//다른 패키지의 것을 가져올 때는 이렇게 패키지와 클래스명을 import해줘야한다.
import java.lang.*;							//패키지명.* 으로 하면 그 패키지 안에 있는 모든 클래스를 import한다는 뜻임.

public class packTest1 {

	public static void main(String[] args) {
		Point p=new Point();					//이대로 두면 error가 남
		//kr.co.babo.Point p=new kr.co.babo.Point();	//이렇게도 가능하지만 너무 비효율적이라서 위에 import를 쓰는게 맞음
		String name="홍길동";					//가능한 방법
		String name2=new String("이기자");	//가능한 방법
		java.lang.String name3=new java.lang.String("고구마");		//이렇게 적어야하지만 이것도 import하는게 맞다.
																	//그러나! java.lang은 import안해도 자동으로 된다. 자동으로 포함되기 때문.
	}
}
