package test;

public class circle extends shape {
		protected int r;
		public void area() {
			res=(int) (r*r*Math.PI);
		}
		public circle() {}
		public circle(int r) {
			this.r=r;
		}
}

//overriding(재정의) : 상속된 메소드와 자식 메소드가 동일할 때
//자식의 메소드로 재정의되는 것

//overloading : 동일한 메소드가 여러개 정의가능한 것 -> 위의 생성자메소드 같은 것
//단, 전달인수가 달라야함(전달파라메타) -> 생성자 메소드에 () 와 (int r) 같은 것처럼 달라야 함