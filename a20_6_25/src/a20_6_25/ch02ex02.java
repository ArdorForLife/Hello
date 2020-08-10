package a20_6_25;
public class ch02ex02 {
	public static void main(String[] args) {
		int a=10, b=3, c, d, e, f, g;
		c=a+b;					//µ¡¼À  c=10+3, c=13 ÀúÀå
		d=a-b;					//»¬¼À  d=10-3, d=7   ÀúÀå
		e=a*b;					//°ö¼À  e=10*3, e=30 ÀúÀå
		f=a/b;					//³ª´°¼À(¸òÀ» ±¸ÇÏ´Â) f=10/3,  f=3 ÀúÀå       -> ´Ù¸¸ Á¤¼ö¿Í Á¤¼ö(int¿Í int)ÀÇ ¸òÀ» ±¸ÇÏ´Â ³ª´°¼ÀÀÏ ¶§ ¸ò¸¸ ³ª¿À´Â °ÍÀÓ
		g=a%b;					//³ª´°¼À(³ª¸ÓÁö¸¦ ±¸ÇÏ´Â)  g=10%3,  g=1 ÀúÀå -> Áß°£¿¡ ÀÖÀ¸¸é ³ª¸ÓÁö ¶ó´Â ¾ê±â
		System.out.println("µ¡¼À="+c);
		System.out.println("»¬¼À="+d);
		System.out.println("°ö¼À="+e);
		System.out.println("³ª´°¼À(¸ò)="+f);
		System.out.println("³ª´°¼À(³ª¸ÓÁö)="+g);	
	}
}
