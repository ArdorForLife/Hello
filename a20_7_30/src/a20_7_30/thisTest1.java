package a20_7_30;
//8장 this와 static.ppt
//this란 현재객체의 현재주소
class point2{
	private int x,y;
	public void show() 
	{
		System.out.println(this.x+","+this.y);
	}
	public point2() 
	{
		this(100,200);
	}
	public point2(int x) 
	{
		this(x,300);
	}
	public point2(int x, int y) 
	{
		this.x=x;
		this.y=y;
	}
}
public class thisTest1 
{
	public static void main(String[] args) 
	{
		point2 kim=new point2(10,20);			//
		point2 lee=new point2(100);				//
		lee.show();
	}

}
