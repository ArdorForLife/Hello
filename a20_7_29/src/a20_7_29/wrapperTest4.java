package a20_7_29;

public class wrapperTest4 {
	
	public static void main(String[] args ) {
		String num="11";
		
		int bin=Integer.parseInt(num,2);
		int oct=Integer.parseInt(num,8);
		int dec=Integer.parseInt(num,10);
		int hex=Integer.parseInt(num,16);
		System.out.println("주어진값="+num);
		System.out.println("2진수로 봣을때="+bin);
		System.out.println("8진수로 봤을때="+oct);
		System.out.println("10진수로 봤을때="+dec);
		System.out.println("16진수로 봤을때="+hex);
		
	}
}
